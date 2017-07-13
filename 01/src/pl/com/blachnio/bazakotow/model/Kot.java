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

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(Date dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public float getWaga() {
        return waga;
    }

    public void setWaga(float waga) {
        this.waga = waga;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public void setImieOpiekuna(String imieOpiekuna) {
        this.imieOpiekuna = imieOpiekuna;
    }

    String przedstawSie(){
        return imieOpiekuna;
    }
}
