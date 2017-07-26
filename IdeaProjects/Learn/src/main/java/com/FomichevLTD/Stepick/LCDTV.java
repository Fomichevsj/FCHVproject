package com.FomichevLTD.Stepick;

/**
 * Created by safomichev on 26.07.2017.
 */
/*
    Класс реализует интферфейс телевизор.
    Жидкокристалический телевизор
 */
public class LCDTV implements TV {
    @Override
    public void on() {
        System.out.println("Включая ЖК телевизор");
    }

    @Override
    public void off() {
        System.out.println("Выключая ЖК телевизор. Пока.");
    }

    @Override
    public void nextChanel() {
        System.out.println("ЖК телевизор. Следующий канал");
    }

    @Override
    public void prevChanel() {
        System.out.println("ЖК телевизор. Предыдущий канал");
    }
}
