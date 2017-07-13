package pl.com.blachnio.bazakotow.model;

import java.util.Date;

/**
 * Created by los_emilos on 2017-07-13.
 */
public class Kot {
    String imie;
    Date dataUrodzenia;
    float waga;
    String imieOpiekuna;

    String przedstawSie(){
        return imieOpiekuna;
    }
}
