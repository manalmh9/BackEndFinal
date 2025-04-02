package UFOLEP_POLYTECH.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import UFOLEP_POLYTECH.Model.JointureCalendrier;

import java.util.List;
import java.util.Optional;

@Repository
public interface JointureCalendrierRepository extends JpaRepository<JointureCalendrier, Long> {

    // Trouver une jointure par événement et utilisateur
    Optional<JointureCalendrier> findByIdEvenementAndIdUtilisateur(Long idEvenement, Long idUtilisateur);

    // Trouver toutes les jointures pour un événement
    List<JointureCalendrier> findByIdEvenement(Long idEvenement);

    // Trouver les participants pour une cible spécifique dans un événement
    List<JointureCalendrier> findByIdEvenementAndCible(Long idEvenement, String cible);
    List<JointureCalendrier> findByIdEvenementAndCibleAndNumeroTir(Long idEvenement, String cible, Integer numeroTir);

}
