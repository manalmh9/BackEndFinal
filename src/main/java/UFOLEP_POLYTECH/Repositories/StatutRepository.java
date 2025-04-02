package UFOLEP_POLYTECH.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import UFOLEP_POLYTECH.Model.ClubsUtilisateur;
import UFOLEP_POLYTECH.Model.Statut;

import java.util.Optional;

@Repository
public interface StatutRepository extends JpaRepository<Statut, Long> {

    // Trouver un statut par son libellé
    Optional<Statut> findByStatut(String statut);
    Statut findByIdUtilisateur(Long id);

}
