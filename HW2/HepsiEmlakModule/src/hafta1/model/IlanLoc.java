package hafta1.model;

import java.util.ArrayList;
import java.util.List;

public class IlanLoc extends Location  {


    public IlanLoc(Kullanici kullanici, String name) {
        super(kullanici, name);
    }

    public IlanLoc(Kullanici kullanıcı) {
        super(kullanıcı, kullanıcı.getName());
    }

    @Override
    public boolean onLocation() {
        System.out.println("Sayın  "+getName()+ " İlanlarımızı görmektesiniz.");
        prepareIlan();

        return true;
    }
    private List<Ilan> prepareIlan(){
        List <Ilan> ilanpanosu = new ArrayList<>();





        return ilanpanosu;
    }
    public String getIlan() {
        return null;
    }


    private static Ilan prepareIlan(String baslik, Kullanici kullanici) {
        Ilan ilan = new Ilan() {


        };
        ilan.setBaslik(baslik);



        //kullanici.mesajKutusu.add(new Mesaj("acil dönüş")); // NPE

        ilan.setKullanici(kullanici);

        ilan.setAktifMi(true);

        ilan.setResimList(ilan.getResimList());

        return ilan;
    }
}
