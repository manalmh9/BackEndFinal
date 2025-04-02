package com.ufolep.polytech.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ufolep.polytech.model.ClubsUtilisateur;
import com.ufolep.polytech.model.Statut;

import java.util.Optional;

@Repository
public interface StatutRepository extends JpaRepository<Statut, Long> {

    // Trouver un statut par son libellé
    Optional<Statut> findByStatut(String statut);
    Statut findByUtilisateur_Id(Long utilisateurId);

}
