package com.FomichevLTD.Stepick;

/**
 * Created by safomichev on 26.07.2017.
 */
public class AlexFactory {
    private TV myTV;
    public AlexFactory(int cost) {
        switch (cost) {
            case 1: this.myTV = new LCDTV();
            break;
            case 2: this.myTV = new LEDTV();
            break;
            case 3: this.myTV = new PlasmaTV();
            break;
            default: throw new RuntimeException("Нет такаого телика");

        }
    }

    public TV getMyTV() {
        return myTV;
    }
}
