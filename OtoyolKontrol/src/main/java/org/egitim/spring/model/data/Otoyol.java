package org.egitim.spring.model.data;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Otoyol {
    private String ad;
    private Double uzunluk;
    private Integer azamiHiz;
    private Double ortalamaHiz;
    private Double asgariGenislik;
    private Double azamiGenislik;
    private Double egim;

    /*
    public Otoyol() {
    }

    public Otoyol(String ad, Double uzunluk, Integer azamiHiz, Double ortalamaHiz, Double asgariGenislik, Double azamiGenislik, Double egim) {
        this.ad = ad;
        this.uzunluk = uzunluk;
        this.azamiHiz = azamiHiz;
        this.ortalamaHiz = ortalamaHiz;
        this.asgariGenislik = asgariGenislik;
        this.azamiGenislik = azamiGenislik;
        this.egim = egim;
    }*/

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(Double uzunluk) {
        this.uzunluk = uzunluk;
    }

    public Integer getAzamiHiz() {
        return azamiHiz;
    }

    public void setAzamiHiz(Integer azamiHiz) {
        this.azamiHiz = azamiHiz;
    }

    public Double getOrtalamaHiz() {
        return ortalamaHiz;
    }

    public void setOrtalamaHiz(Double ortalamaHiz) {
        this.ortalamaHiz = ortalamaHiz;
    }

    public Double getAsgariGenislik() {
        return asgariGenislik;
    }

    public void setAsgariGenislik(Double asgariGenislik) {
        this.asgariGenislik = asgariGenislik;
    }

    public Double getAzamiGenislik() {
        return azamiGenislik;
    }

    public void setAzamiGenislik(Double azamiGenislik) {
        this.azamiGenislik = azamiGenislik;
    }

    public Double getEgim() {
        return egim;
    }

    public void setEgim(Double egim) {
        this.egim = egim;
    }

    @Override
    public String toString() {
        return "Otoyol{" +
                "ad='" + ad + '\'' +
                ", uzunluk=" + uzunluk +
                ", azamiHiz=" + azamiHiz +
                ", ortalamaHiz=" + ortalamaHiz +
                ", asgariGenislik=" + asgariGenislik +
                ", azamiGenislik=" + azamiGenislik +
                ", egim=" + egim +
                '}';
    }
}
