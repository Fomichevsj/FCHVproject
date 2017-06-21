/**
 * Created by safomichev on 19.06.2017.
 */
public class Stepick {


    public static class HelloThread extends Thread {

        public void run() {
            System.out.println("Hello from a another thread!");
        }

    }
    public static HelloThread helloThread = new HelloThread();


    public static int[] mergeArrays(int [] a1, int [] a2) {

        //System.out.println("-> " + "Размер первого массива: " + a1.length);
        //System.out.println("-> " + "Размер второго массива: " + a2.length);
        if(a1.length == 0 && a2.length == 0)
            return new int[]{};

        // Создадим результирующий массив
        int[] a = new int[a1.length + a2.length];
        // Начнем слияние. Будем одновременно просматривать оба массива
        int i = 0;
        int j = 0;
        int k = 0;
        while( i < a1.length && j < a2.length ) {

            if(a1[i] <= a2[j]) {
                //System.out.println("-> " + a1[i] + " <= " + a2[j]);
                //System.out.println("-> " + "Заносим в массив a в ячейку " + k + " Значение " + a1[i]);
                a[k++] = a1[i++];
            }
            else {
                //System.out.println("-> " + a1[i] + " > " + a2[j]);
                //System.out.println("-> " + "Заносим в массив a в ячейку " + k + " Значение " + a2[j]);
                a[k++] = a2[j++];
            }
        }
        //System.out.println("-> " + "значение i " + i );
        //System.out.println("-> " + "значение j " + j );

        if(i == a1.length) {
            while (j < a2.length) {
                //System.out.println("-> " + "Заносим в массив a в ячейку " + k + " Значение " + a2[j]);
                a[k++] = a2[j++];
            }
        }
        else {
            while (i < a1.length) {
                //System.out.println("-> " + "Заносим в массив a в ячейку " + k + " Значение " + a1[i]);
                a[k++] = a1[i++];
            }
        }

        //System.out.println("-> " + "Полученный массив данных: ");
        for(int r:a) {
            //System.out.print(r + " ");
        }
        //System.out.println("");

        return a;
    }

    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("Имя основного потока: " + mainThread.getName());
        System.out.println("До того как создали новый поток");
        helloThread.run();
        System.out.println("После того как создали новый поток");
        System.out.println("Первый тест");
        int [] a1 = {1, 2, 3, 4, 5};
        int [] a2 = {4, 5, 6, 7};
        mergeArrays(a1, a2);
        for(int r:mergeArrays(a1, a2)) System.out.print(r + " ");
        System.out.println("");

        System.out.println("Второй тест");
        a1 = new int[]{};
        a2 = new int[] {2, 3};
        mergeArrays(a1, a2);
        for(int r:mergeArrays(a1, a2)) System.out.print(r + " ");
        System.out.println("");

        System.out.println("Третий тест");
        a1 = new int[]{};
        a2 = new int[] {};
        mergeArrays(a1, a2);
        for(int r:mergeArrays(a1, a2)) System.out.print(r + " ");
        System.out.println("");

        System.out.println("Четвертый тест");
        a1 = new int[]{2, 3};
        a2 = new int[] {2, 3};
        mergeArrays(a1, a2);
        for(int r:mergeArrays(a1, a2)) System.out.print(r + " ");
        System.out.println("");

        System.out.println("Пятый тест");
        a1 = new int[]{9, 10, 34, 37};
        a2 = new int[] {1, 2, 3, 4, 5, 6};
        mergeArrays(a1, a2);
        for(int r:mergeArrays(a1, a2)) System.out.print(r + " ");
        System.out.println("");
        // test func

    }
}
