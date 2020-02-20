package fr.tzoreol.votewatcher.daos;

import fr.tzoreol.votewatcher.domain.Liste;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ListeRepository extends CrudRepository<Liste, Integer> {

    @Query("SELECT l FROM Liste l WHERE l.id < 96")
    List<Liste> recupererListesCandidates();
}