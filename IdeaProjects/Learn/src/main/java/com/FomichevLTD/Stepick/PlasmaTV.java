package com.FomichevLTD.Stepick;

/**
 * Created by safomichev on 26.07.2017.
 */
public class PlasmaTV implements TV {
    @Override
    public void on() {
        System.out.println("PlasmaTV включили");
    }

    @Override
    public void off() {
        System.out.println("PlasmaTV выключили. Пока");
    }

    @Override
    public void nextChanel() {
        System.out.println("PlasmaTV следующий канал");
    }

    @Override
    public void prevChanel() {
        System.out.println("PlasmaTV предудыщий канал");
    }
}
