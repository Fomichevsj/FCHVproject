package com.FomichevLTD.Stepick;

/**
 * Created by safomichev on 26.07.2017.
 */
/*
    Возвращает Plasma телевизор
 */
public class PlasmaFactory implements TVFactory {
    @Override
    public TV getTV() {
        return new PlasmaTV();
    }
}
