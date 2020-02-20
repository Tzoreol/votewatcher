package fr.tzoreol.votewatcher.daos;

import fr.tzoreol.votewatcher.domain.Bureau;
import org.springframework.data.repository.CrudRepository;

public interface BureauRepository extends CrudRepository<Bureau, Integer> {}