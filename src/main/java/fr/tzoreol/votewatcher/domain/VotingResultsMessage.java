package fr.tzoreol.votewatcher.domain;

import java.util.List;
import java.util.Map;

public class VotingResultsMessage {

    private Integer bureau_id;
    private Map<Integer,Integer> voix;
    private Map<Integer, Integer> total_par_liste;

    public VotingResultsMessage(Integer bureau_id, Map<Integer, Integer> voix, Map<Integer, Integer> total_par_liste) {
      this.bureau_id = bureau_id;
      this.voix = voix;
      this.total_par_liste = total_par_liste;
    }

    public Integer getBureau_id() {
        return bureau_id;
    }

    public void setBureau_id(Integer bureau_id) {
        this.bureau_id = bureau_id;
    }

    public Map<Integer, Integer> getVoix() {
        return voix;
    }

    public void setVoix(Map<Integer, Integer> voix) {
        this.voix = voix;
    }

    public Map<Integer, Integer> getTotal_par_liste() {
        return total_par_liste;
    }

    public void setTotal_par_liste(Map<Integer, Integer> total_par_liste) {
        this.total_par_liste = total_par_liste;
    }
}