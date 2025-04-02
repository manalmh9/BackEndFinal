package com.ufolep.polytech.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ufolep.polytech.model.*;

import com.ufolep.polytech.Repositories.*;

import java.util.Optional;

@Service
public class StatutService {

    @Autowired
    private StatutRepository statutRepository;

    // Récupérer un statut par son nom
    public Optional<Statut> getStatutByName(String statut) {
        return statutRepository.findByStatut(statut);
    }

    // Créer ou mettre à jour un statut
    public Statut saveStatut(Statut statut) {
        return statutRepository.save(statut);
    }

    // Supprimer un statut
    public void deleteStatut(Long id) {
        statutRepository.deleteById(id);
    }
    public String assignStatutToUser(Statut statut) {
        statutRepository.save(statut);
        return "Statut assigned successfully!";
    }

    // Obtenir le statut d'un utilisateur
    public Statut getStatutByUser(Long userId) {
        return statutRepository.findByUtilisateur_Id(userId);
    }
}
