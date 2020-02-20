package fr.tzoreol.votewatcher.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Embeddable
public class ScrutinId implements Serializable {

    @ManyToOne
    private Bureau bureau;

    @ManyToOne
    private Liste liste;

    /**
     * Certains id de liste sont réservés
     *
     * 99 : Inscrits
     * 98 : Votants
     * 97 : Blancs
     * 96 : Nuls
     */

    public Bureau getBureau() {
        return bureau;
    }

    public void setBureau(Bureau bureau) {
        this.bureau = bureau;
    }

    public Liste getListe() {
        return liste;
    }

    public void setListe(Liste liste) {
        this.liste = liste;
    }
}