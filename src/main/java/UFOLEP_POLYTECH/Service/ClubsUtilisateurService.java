package UFOLEP_POLYTECH.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UFOLEP_POLYTECH.Model.Marque;
import UFOLEP_POLYTECH.Repositories.MarqueRepository;
import UFOLEP_POLYTECH.*;
@Service
public class ClubsUtilisateurService {

    @Autowired
    private MarqueRepository marqueRepository;

    // Récupérer le score d'un utilisateur pour un événement et une cible
    public List<Marque> getScore(String user_license, Long id_evenement, Long id_cible, Integer depart) {
        return marqueRepository.findByLicenceAndIdEvenementAndIdCible(user_license, id_evenement, id_cible);
    }

    // Récupérer les informations sur l'étape d'un utilisateur
    public String getStepInfo(String user_license, Long id_evenement, Long id_cible, Integer depart) {
        // Logique pour récupérer les informations sur l'étape
        return "Informations sur l'étape";
    }

    // Sauvegarder le score d'un utilisateur
    public String saveScore(String user_license, Marque marque) {
        marqueRepository.save(marque);
        return "Score sauvegardé avec succès";
    }

    // Mettre à jour le score d'un utilisateur
    public String updateScore(String user_license, Marque marque) {
        marqueRepository.save(marque);
        return "Score mis à jour avec succès";
    }
}
