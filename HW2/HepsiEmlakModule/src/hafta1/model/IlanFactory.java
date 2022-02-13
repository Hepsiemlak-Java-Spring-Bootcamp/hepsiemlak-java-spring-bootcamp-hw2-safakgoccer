package hafta1.model;

public class IlanFactory {


    public static Ilan getIlan(String tip) {

        if ("Tarla".equalsIgnoreCase(tip))
            return new Tarla();
        else if ("Konut".equalsIgnoreCase(tip))

            return new Konut();

        return null;

    }
}