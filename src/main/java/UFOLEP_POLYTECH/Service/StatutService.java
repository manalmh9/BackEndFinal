package UFOLEP_POLYTECH.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UFOLEP_POLYTECH.Model.Statut;
import UFOLEP_POLYTECH.Repositories.StatutRepository;

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
}
