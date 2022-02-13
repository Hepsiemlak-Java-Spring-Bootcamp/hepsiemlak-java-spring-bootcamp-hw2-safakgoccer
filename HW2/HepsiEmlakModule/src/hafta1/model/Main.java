package hafta1.model;

public class Main {

    public static void main(String[] args) {

        Ilan tarlaIlan = IlanFactory.getIlan("Tarla");
        Ilan KonutIlan = IlanFactory.getIlan("Konut");

        System.out.println(Konut.getIlan());
        System.out.println(Tarla.getIlan());

        Giris game=new Giris();
        game.start();
    }

}

