package UFOLEP_POLYTECH.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import UFOLEP_POLYTECH.Model.Calendrier;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface CalendrierRepository extends JpaRepository<Calendrier, Long> {

    // Trouver un événement par son ID
    Optional<Calendrier> findByIdEvenement(Long idEvenement);

    // Trouver tous les événements dans une période spécifique
    List<Calendrier> findByDateDebutBetween(LocalDate startDate, LocalDate endDate);

    // Trouver tous les événements par statut
    List<Calendrier> findByStatut(String statut);
}
