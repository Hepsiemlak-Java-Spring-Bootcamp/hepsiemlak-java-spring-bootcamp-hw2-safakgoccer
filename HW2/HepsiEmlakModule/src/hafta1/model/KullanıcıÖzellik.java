package hafta1.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class KullanıcıÖzellik {
    private int id;
    private String name;
    private String email;
    List<Mesaj> mesajKutusu;
    Set<Ilan> favoriIlanlar = new HashSet<>();
    String fotograf;


    public KullanıcıÖzellik(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email=email;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
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




