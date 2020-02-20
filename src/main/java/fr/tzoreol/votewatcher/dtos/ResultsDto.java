package fr.tzoreol.votewatcher.dtos;

import fr.tzoreol.votewatcher.domain.Bureau;

import java.util.ArrayList;
import java.util.List;

public class ResultsDto {

    private Bureau bureau;
    private Integer inscrits;
    private Integer votants;
    private List<ListeDto> listesCandidates;
    private Integer blancs;
    private Integer nuls;

    public ResultsDto() {
        this.listesCandidates = new ArrayList<>();
    }

    public Bureau getBureau() {
        return bureau;
    }

    public void setBureau(Bureau bureau) {
        this.bureau = bureau;
    }

    public Integer getInscrits() {
        return inscrits;
    }

    public void setInscrits(Integer inscrits) {
        this.inscrits = inscrits;
    }

    public Integer getVotants() {
        return votants;
    }

    public void setVotants(Integer votants) {
        this.votants = votants;
    }

    public List<ListeDto> getListesCandidates() {
        return listesCandidates;
    }

    public void setListesCandidates(List<ListeDto> listesCandidates) {
        this.listesCandidates = listesCandidates;
    }

    public Integer getBlancs() {
        return blancs;
    }

    public void setBlancs(Integer blancs) {
        this.blancs = blancs;
    }

    public Integer getNuls() {
        return nuls;
    }

    public void setNuls(Integer nuls) {
        this.nuls = nuls;
    }

    public void ajouterListe(ListeDto listeDto) {
        this.listesCandidates.add(listeDto);
    }
}
