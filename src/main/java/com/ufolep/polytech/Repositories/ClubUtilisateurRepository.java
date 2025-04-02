package com.ufolep.polytech.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ufolep.polytech.model.ClubsUtilisateur;

import java.util.Optional;


@Repository
public interface ClubUtilisateurRepository extends JpaRepository<ClubsUtilisateur, Long> {

    // Trouver un utilisateur par sa licence
    Optional<ClubsUtilisateur> findByLicence(String licence);

    // Trouver un utilisateur par son nom et prénom
    Optional<ClubsUtilisateur> findByNomAndPrenom(String nom, String prenom);

    // Vérifier si un utilisateur existe déjà par licence
    boolean existsByLicence(String licence);

}
