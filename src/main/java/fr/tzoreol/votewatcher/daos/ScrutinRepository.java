package fr.tzoreol.votewatcher.daos;

import fr.tzoreol.votewatcher.domain.Scrutin;
import fr.tzoreol.votewatcher.domain.ScrutinId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ScrutinRepository extends CrudRepository<Scrutin, ScrutinId> {

    @Query("SELECT s FROM Scrutin s WHERE s.scrutinId.liste.id = 99")
    List<Scrutin> recupererInscrits();

    @Query("SELECT s FROM Scrutin s WHERE s.scrutinId.liste.id = 98")
    List<Scrutin> recupererVotants();

    @Query("SELECT s FROM Scrutin s WHERE s.scrutinId.liste.id = 97")
    List<Scrutin> recupererBlancs();

    @Query("SELECT s FROM Scrutin s WHERE s.scrutinId.liste.id = 96")
    List<Scrutin> recupererNuls();

    @Query("SELECT s FROM Scrutin s WHERE s.scrutinId.liste.id = ?1 ORDER BY s.scrutinId.liste.id, s.scrutinId.bureau.id")
    List<Scrutin> recupererResultatsParListe(Integer idListe);

    @Query("SELECT SUM(s.voix) FROM Scrutin s WHERE s.scrutinId.liste.id < 96 AND s.scrutinId.bureau.id = ?1")
    Integer recupererExprimesParBureau(Integer idBureau);

    @Query("SELECT SUM(s.voix) FROM Scrutin s WHERE s.scrutinId.liste.id=99")
    Integer recupererTotalInscrits();

    @Query("SELECT SUM(s.voix) FROM Scrutin s WHERE s.scrutinId.liste.id=98")
    Integer recupererTotalVotants();

    @Query("SELECT SUM(s.voix) FROM Scrutin s WHERE s.scrutinId.liste.id=97")
    Integer recupererTotalBlancs();

    @Query("SELECT SUM(s.voix) FROM Scrutin s WHERE s.scrutinId.liste.id=96")
    Integer recupererTotalNuls();

    @Query("SELECT SUM(s.voix) FROM Scrutin s WHERE s.scrutinId.liste.id = ?1")
    Integer recupererTotalParListe(Integer idListe);

    @Query("SELECT SUM(s.voix) FROM Scrutin s WHERE (s.scrutinId.liste.id=96 OR s.scrutinId.liste.id=97) AND s.scrutinId.bureau.id = ?1")
    Integer recupererTotalNonExprimesParBureau(Integer idBureau);

    @Query("SELECT SUM(s.voix) FROM Scrutin s WHERE s.scrutinId.liste.id < 96")
    Integer recupererTotalExprimes();
}