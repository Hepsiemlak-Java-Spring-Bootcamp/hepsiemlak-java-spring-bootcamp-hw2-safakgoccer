package hafta1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mesaj {
    public static Scanner input=new Scanner(System.in);
    String Alıcı;
    String Gönderen;
    String baslik;
    String icerigi;
    int gonderilenTarih;




    public Mesaj(String Gönderen,String Alıcı,String baslik, String icerigi, int gonderilenTarih) {
        this.Gönderen=Gönderen;
        this.Alıcı=Alıcı;
        this.baslik = baslik;
        this.icerigi = icerigi;
        this.gonderilenTarih = gonderilenTarih;
    }

    public boolean onLocation() {
       return false;
    }



    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getIcerigi() {
        return icerigi;
    }

    public void setIcerigi(String icerigi) {
        this.icerigi = icerigi;
    }

    public int getGonderilenTarih() {
        return gonderilenTarih;
    }

    public void setGonderilenTarih(int gonderilenTarih) {
        this.gonderilenTarih = gonderilenTarih;
    }
}