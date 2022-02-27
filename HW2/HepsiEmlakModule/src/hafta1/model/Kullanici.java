package hafta1.model;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Kullanici {
    int id;
    private String name;
    private String email;
    private Scanner input = new Scanner(System.in);
    List<Mesaj> mesajKutusu;


    public Kullanici(int id,String name, String email,List<Mesaj> mesajKutusu) {
        this.id=id;
        this.name = name;
        this.email = email;
        this.mesajKutusu=mesajKutusu;
    }

    public void  selectKullanıcı() {
        System.out.println("-------------------------------");
        KullanıcıÖzellik[] KullanıcıList = {new Safak(),new Cem(), new Ayse(), new Admin()};
        for (KullanıcıÖzellik kullanıcıList : KullanıcıList) {
            System.out.println("ID:" + kullanıcıList.getId() +
                    "\t\tKulllanıcı  " + kullanıcıList.getName());

        }
        System.out.println("------------------------------");
        System.out.println("Lütfen bir kullanıcı seçiniz  1 - Şafak  --   2 - Cem  --  3 - Ayşe  --  4 - Admin");


        int selectChar = input.nextInt();
        switch (selectChar) {

            case 0:
                initkullanıcı(new Safak());

            case 1:
                initkullanıcı(new Safak());

            case 2:
                initkullanıcı(new Cem());
                break;
            case 3:
                initkullanıcı(new Ayse());

                break;
            case 4:
                initkullanıcı(new Admin());
                break;
            default:
                new Admin();
                break;

        }
        System.out.println("Kullanıcı : " + this.getName() +
                "\t\t Mail : " + this.getEmail());


    }
    public void initkullanıcı(KullanıcıÖzellik kullanıcı){
        this.setName(kullanıcı.getName());
        this.setEmail(kullanıcı.getEmail());

    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
