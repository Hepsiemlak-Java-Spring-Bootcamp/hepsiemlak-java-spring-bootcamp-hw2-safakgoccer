package hafta1.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {


    private Scanner input=new Scanner(System.in);
    private Object Location;
    private  static Kullanici kullanici;

    static {
        kullanici = new Kullanici(1,
                "girişkullanıcısı",
                "giriş@mail.com",
                null);
    }

    private  static Kullanici Cem = new Kullanici(2,"cem", "giriş@mail.com", kullanici.mesajKutusu);
    private  static Kullanici ayse = new Kullanici(3,"ayse", "giriş@mail.com", kullanici.mesajKutusu);
    private  static Kullanici Safak = new Kullanici(4,"ayşe", "giriş@mail.com", ayse.mesajKutusu);




    public void start() {



       // kullanici.mesajKutusu = prepareMesajKutusu();



        String[] resimList = new String[5];





        System.out.println("Emlak sitemize hoşgeldiniz");


        kullanici.selectKullanıcı();




        Location location=null;


        while (true) {

            System.out.println();
            System.out.println("------------Seçenekler------------");
            System.out.println();
            System.out.println("1 -  İlanlarım       -->>>  Burası sizin ilan işlemleri yapacağanız kategori");
            System.out.println("2 -  Mesajlarım           -->>>  Mesajlarınıza bakabilirsiniz.");
            System.out.println("0 -  Çıkış Yap        -->>>  Oyunu sonlandır.");

            int selectloc=input.nextInt();
            switch (selectloc) {
                case 0:
                    location=null;
                    break;
                case 1:
                    location= new IlanLoc(kullanici);
                    break;
                case 2:
                    location= new MesajLoc(kullanici) {
                    };
                    break;

                default:
                    System.out.println("Lütfen geçerli bir kategori giriniz.!");
                    location= new IlanLoc(kullanici);

                    break;

            }
            if(location==null){
                System.out.println("İyi günler Görüşmek üzere..");
                break;
            }
            if (!location.onLocation()){
                System.out.println("GAME OVER");
                break;
            }
        }}



        }


