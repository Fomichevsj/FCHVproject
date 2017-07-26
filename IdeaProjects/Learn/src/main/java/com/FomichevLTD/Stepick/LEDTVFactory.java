package com.FomichevLTD.Stepick;

/**
 * Created by safomichev on 26.07.2017.
 */
/*
    Вернем LED телевизор
 */
public class LEDTVFactory implements TVFactory {
    @Override
    public TV getTV() {
        return new  LEDTV();
    }
}
