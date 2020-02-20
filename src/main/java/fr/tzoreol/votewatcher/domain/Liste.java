package fr.tzoreol.votewatcher.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Liste {

    @Id
    private Integer id;

    private String teteDeListe;

    private String nomDeListe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeteDeListe() {
        return teteDeListe;
    }

    public void setTeteDeListe(String teteDeListe) {
        this.teteDeListe = teteDeListe;
    }

    public String getNomDeListe() {
        return nomDeListe;
    }

    public void setNomDeListe(String nomDeListe) {
        this.nomDeListe = nomDeListe;
    }
}