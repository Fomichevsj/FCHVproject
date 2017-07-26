package com.FomichevLTD.Stepick;

/**
 * Created by safomichev on 26.07.2017.
 */
public class WorkWithAlexFactory {
    public static void main(String [] args) {
        AlexFactory alexFactory = new AlexFactory(2);// Создаем объект по входным параметрам

        TV myTV = alexFactory.getMyTV();

        myTV.on();
        myTV.nextChanel();
        myTV.prevChanel();
        myTV.off();
    }
}
