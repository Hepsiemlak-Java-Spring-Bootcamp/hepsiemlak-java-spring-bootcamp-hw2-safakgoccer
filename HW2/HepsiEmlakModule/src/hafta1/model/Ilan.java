package hafta1.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Ilan {


    private String tür;
    private String baslik;
    private Kullanici kullanici; // hem bireysel & kurumsal
    private String[] resimList = new String[5];
    private BigDecimal fiyat;
    private int suresi;
    private boolean oneCikarilsinMi = false;
    private boolean incelendiMi = false;

    private boolean aktifMi;

    public Ilan(String tür, String baslik, boolean aktifMi) {
        this.tür = tür;
        this.baslik = baslik;
        this.aktifMi = aktifMi;
    }

    List<Ilan> ilanListesi = new ArrayList<>();

    public Ilan() {

    }

    public static String getIlan() {
        return null;
    }



    public String getTür() {
        return tür;
    }

    public void setTür(String tür) {
        this.tür = tür;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }

    public String[] getResimList() {
        return resimList;
    }

    public void setResimList(String[] resimList) {
        this.resimList = resimList;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        this.fiyat = fiyat;
    }

    public int getSuresi() {
        return suresi;
    }

    public void setSuresi(int suresi) {
        this.suresi = suresi;
    }

    public boolean isOneCikarilsinMi() {
        return oneCikarilsinMi;
    }

    public void setOneCikarilsinMi(boolean oneCikarilsinMi) {
        this.oneCikarilsinMi = oneCikarilsinMi;
    }

    public boolean isIncelendiMi() {
        return incelendiMi;
    }

    public void setIncelendiMi(boolean incelendiMi) {
        this.incelendiMi = incelendiMi;
    }





    public boolean isAktifMi() {
        return aktifMi;
    }

    public void setAktifMi(boolean aktifMi) {
        this.aktifMi = aktifMi;
    }



}



