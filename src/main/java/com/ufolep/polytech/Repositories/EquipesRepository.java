package com.ufolep.polytech.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ufolep.polytech.model.Equipes;

import java.util.List;
import java.util.Optional;

@Repository
public interface EquipesRepository extends JpaRepository<Equipes, Long> {

    // Trouver une équipe par ID d'événement et d'équipe
    Optional<Equipes> findByIdEvenementAndIdEquipe(Long idEvenement, String idEquipe);

    // Trouver toutes les équipes d'un événement
    List<Equipes> findByIdEvenement(Long idEvenement);
}
