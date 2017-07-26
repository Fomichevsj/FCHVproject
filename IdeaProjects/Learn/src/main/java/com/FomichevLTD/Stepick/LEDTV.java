package com.FomichevLTD.Stepick;

/**
 * Created by safomichev on 26.07.2017.
 */
/*
    Релизаует интферфейс TV
    Light Emitting Diode телевизор
 */
public class LEDTV implements TV {
    @Override
    public void on() {
        System.out.println("LEDTV включили");
    }

    @Override
    public void off() {
        System.out.println("LEDTV выключили. Пока");
    }

    @Override
    public void nextChanel() {
        System.out.println("LEDTV следующий канал");
    }

    @Override
    public void prevChanel() {
        System.out.println("LEDTV предыдущий канал");
    }
}
