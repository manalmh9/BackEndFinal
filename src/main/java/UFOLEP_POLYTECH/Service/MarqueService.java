package UFOLEP_POLYTECH.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UFOLEP_POLYTECH.Model.Marque;
import UFOLEP_POLYTECH.Repositories.MarqueRepository;

@Service
public class MarqueService {

    @Autowired
    private MarqueRepository marqueRepository;

    // Enregistrer un score
    public Marque saveScore(Marque marque) {
        return marqueRepository.save(marque);
    }

    // Mettre à jour un score
    public Marque updateScore(Marque marque) {
        return marqueRepository.save(marque);
    }

    // Récupérer tous les scores d'un utilisateur pour un événement et une cible
    public List<Marque> getScoresByUserAndEvent(String user_license, Long id_evenement, Long id_cible) {
        return marqueRepository.findByLicenceAndIdEvenementAndIdCible(user_license, id_evenement, id_cible);
    }
}
