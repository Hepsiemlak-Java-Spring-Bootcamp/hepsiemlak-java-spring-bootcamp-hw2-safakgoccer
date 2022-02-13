package hafta1.model;

import java.util.ArrayList;
import java.util.List;

public abstract class MesajLoc extends Location {


    private String Gönderen;
    private String Alıcı;
    public MesajLoc(Kullanici kullanıcı) {
        super(kullanıcı, kullanıcı.getName());
        this.Gönderen=Gönderen;
        this.Alıcı=Alıcı;
    }



    @Override
    public boolean onLocation() {
        System.out.println("************Mesajlarınız********");
        System.out.println("                     ");

        boolean showMesaj = true;

        ayseprepareMesajKutusu();

        while (showMesaj) {

            int selectCase = Location.input.nextInt();
            while (selectCase != 1) {
                System.out.println("Geçersiz bir seçim yaptınız,tekrar giriniz");
                selectCase = input.nextInt();

                }

                return true;
            }

        return showMesaj;
    }
    private List<Mesaj> ayseprepareMesajKutusu() {

        List<Mesaj> mesajKutusu = new ArrayList<>();
        mesajKutusu.add(new Mesaj("Admin","Safak","Merhaba","rahatsız ediyorum",210212));
        mesajKutusu.add(new Mesaj("Ayşe",getName(),"Ev","3+1 ilanı için rahatsız ediyorum",210212));
        mesajKutusu.add(new Mesaj(getName(),"Cem","Araba","Arac kaç model",210212));
        mesajKutusu.add(new Mesaj("Cem","Admin","Tarla","İyi akşamlar",210212));

        for (Mesaj mesaj:mesajKutusu) {
            System.out.println("Gönderen  :" +mesaj.Gönderen+"  Alıcı : " +mesaj.Alıcı+"Mesaj Başlığı :  "+mesaj.baslik +" Mesaj    :  "+mesaj.icerigi +"    Gönderim Tarihi   : "+mesaj.gonderilenTarih);
        }
        System.out.println("*******************");
        System.out.println("Geri dönmek için 1 e basın!!!");

        return mesajKutusu;
    }



}