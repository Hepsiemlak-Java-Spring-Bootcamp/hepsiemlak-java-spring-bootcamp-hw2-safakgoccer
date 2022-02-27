package hafta1.model;


import java.util.Scanner;

public abstract class Location {

    private Kullanici Kullanıcı;
    private String name;
    public static Scanner input=new Scanner(System.in);


    public Location(Kullanici player, String name) {
        this.Kullanıcı = player;
        this.name = name;
    }
    public abstract boolean onLocation();

    public Kullanici getPlayer() {
        return Kullanıcı;
    }

    public void setPlayer(Kullanici player) {
        this.Kullanıcı = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}