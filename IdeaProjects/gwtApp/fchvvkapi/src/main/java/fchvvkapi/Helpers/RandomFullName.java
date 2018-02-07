package fchvvkapi.Helpers;

import java.util.Random;

public class RandomFullName {


    /**Фамилии*/
    private final static String[] f ={
            "Иванов",
            "Козлов",
            "Петов",
            "Сидоров",
            "Евгеньев",
            "Алексеев",
            "Бережнов",
            "Клинков",
            "Валерьянов",
            "Утюгов"};

    /**Имена*/
    private final static String[] name =  {
            "Алексей",
            "Сергей",
            "Семен",
            "Виктор",
            "Андрей",
            "Станислав",
            "Юрий",
            "Михаил",
            "Константин",
             "Денис"};

    /**Отчества*/
    private final static String[] mid = {
            "Алексеевич",
            "Сергеевич",
            "Семенович",
            "Викторович",
            "Петрович",
            "Андреевич",
            "Кириллович",
            "Михайлович",
            "Константинович",
             "Денисович"};



    public static String getNextFIO() {
        Random random = new Random();
        int k1 = random.nextInt(10);
        int k2 = random.nextInt(10);
        int k3 = random.nextInt(10);

        String s = f[k1] + " "  + name[k2] + " " + mid[k3];

        return s;
    }

    public static String getNextLastName() {
        Random random = new Random();
        int k1 = random.nextInt(10);

        return f[k1];
    }

    public static String getNextFirstName() {
        Random random = new Random();
        int k2 = random.nextInt(10);

        return name[k2];
    }

    public static String getNextMidName() {
        Random random = new Random();
        int k3 = random.nextInt(10);

        return mid[k3];
    }
}
