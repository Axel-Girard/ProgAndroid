package org.training.android.td1;

/**
 * Created by E15B685M on 23/11/15.
 */
public class Artiste {
    private long id;
    private String nom;

    Artiste(){}
    Artiste(long id, String nom){
        this.id = id;
        this.nom = nom;
    }

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }

    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
}
