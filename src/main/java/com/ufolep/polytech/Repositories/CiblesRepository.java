package com.ufolep.polytech.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

import com.ufolep.polytech.model.Cibles;
@Repository
public interface CiblesRepository extends JpaRepository<Cibles, Long> {

    // Trouver une cible par son code
    Optional<Cibles> findByCode(String code);

    // Trouver toutes les cibles par événement
    List<Cibles> findByIdEvenement(Long idEvenement);
}
