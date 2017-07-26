package com.FomichevLTD.Stepick;

/**
 * Created by safomichev on 26.07.2017.
 */
/*
    Класс клиент. тут делаю всякую хурму
 */
public class WorkWithTV {
    public static void main(String[] args) {
        System.out.println("Начинаем работу с теликами. Поехали");

        TV myTV = new LCDTV();// явно прописываю какой именно телик я хочу



        myTV.on();// Включаем
        myTV.nextChanel();// Щелкаем вперед
        myTV.prevChanel();// Щелкаем назад
        myTV.off();// Выключаем

    }
}

