package fr.tzoreol.votewatcher.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Scrutin {

    @EmbeddedId
    private ScrutinId scrutinId;

    private int voix;

    public ScrutinId getScrutinId() {
        return scrutinId;
    }

    public void setScrutinId(ScrutinId scrutinId) {
        this.scrutinId = scrutinId;
    }

    public int getVoix() {
        return voix;
    }

    public void setVoix(int voix) {
        this.voix = voix;
    }
}