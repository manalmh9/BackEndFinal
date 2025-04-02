package com.ufolep.polytech.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ufolep.polytech.model.Marque;

import java.util.List;

@Repository
public interface MarqueRepository extends JpaRepository<Marque, Long> {

    // Trouver les scores d'un utilisateur pour un événement et une cible spécifique
    List<Marque> findByLicenceAndIdEvenementAndIdCible(String licence, Long idEvenement, Long idCible);

    // Trouver les scores d'un utilisateur pour un événement spécifique
    List<Marque> findByLicenceAndIdEvenement(String licence, Long idEvenement);

}
