package com.FomichevLTD.Stepick;

/**
 * Created by safomichev on 26.07.2017.
 */
/*
    Вернем LCD телевизор
 */
public class LCDTVFactory implements TVFactory {
    @Override
    public TV getTV() {
        return new LCDTV();
    }
}
