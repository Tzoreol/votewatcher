package fr.tzoreol.votewatcher.dtos;

import fr.tzoreol.votewatcher.domain.Bureau;
import fr.tzoreol.votewatcher.domain.Liste;
import org.springframework.context.annotation.Bean;

public class ListeDto {

    private Liste liste;
    private Integer nombreVoix;

    public ListeDto() {

    }

    public ListeDto(Liste liste) {
        this.liste = liste;
        this.nombreVoix = 0;
    }

    public Liste getListe() {
        return liste;
    }

    public void setListe(Liste liste) {
        this.liste = liste;
    }

    public Integer getNombreVoix() {
        return nombreVoix;
    }

    public void setNombreVoix(Integer nombreVoix) {
        this.nombreVoix = nombreVoix;
    }
}
