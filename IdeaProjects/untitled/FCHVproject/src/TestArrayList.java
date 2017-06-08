import java.util.ArrayList;

/**
 * Created by safomichev on 02.06.2017.
 */
public class TestArrayList {
    public static void main(String []args) {

        ArrayList<BaseClassA> arrayList = new ArrayList<BaseClassA>(10);
        // Предположим, что как-то вот тут я инициализировал мой массив.
        // Пофиг из каких элементов он состоит

        // Почему он здесь требует new?   точнее здесь то понятно. Там нужно поставить new
        BaseClassA baseClasstest = arrayList.get(1);

        for (int i = 0;i < arrayList.size(); i++) {
            // вопрос вот тут
            //  а вот здесь он ругается и не хочет брать new
            // Вопрос: где мы создаем в первый раз baseClassA?


        }

    }
}
