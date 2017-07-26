package com.FomichevLTD.Stepick;

/**
 * Created by safomichev on 26.07.2017.
 */
public class WorkWithTVFactory {
    public static void main(String [] args) {
        TVFactory tvFactory = new LCDTVFactory();// Создать фабркику для получения телика


        TV myTV = tvFactory.getTV();// Получить телик

        myTV.on();
        myTV.nextChanel();
        myTV.prevChanel();
        myTV.off();



    }
}
