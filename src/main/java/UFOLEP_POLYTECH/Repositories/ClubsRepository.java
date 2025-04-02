package UFOLEP_POLYTECH.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import UFOLEP_POLYTECH.Model.Clubs;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClubsRepository extends JpaRepository<Clubs, Long> {

    // Trouver un club par son nom
    Optional<Clubs> findByNom(String nom);

    // Trouver tous les clubs dans une région spécifique
    List<Clubs> findByRegion(String region);
}
