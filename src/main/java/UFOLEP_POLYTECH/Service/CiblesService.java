package UFOLEP_POLYTECH.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UFOLEP_POLYTECH.Model.Cibles;
import UFOLEP_POLYTECH.Model.JointureCalendrier;
import UFOLEP_POLYTECH.Repositories.CiblesRepository;
import UFOLEP_POLYTECH.Repositories.JointureCalendrierRepository;

import java.util.List;

@Service
public class CiblesService {

    @Autowired
    private CiblesRepository ciblesRepository;

    @Autowired
    private JointureCalendrierRepository jointureCalendrierRepository;

    // Récupérer les participants en fonction du code de la cible, de l'événement et du département
    public List<JointureCalendrier> getParticipantsBasedOnCibleCode(Long id_cible, Long id_evenement, Integer depart) {
        return jointureCalendrierRepository.findByIdEvenementAndCibleAndNumeroTir(id_evenement, id_cible.toString(), depart);
    }

    // Ajouter un participant à la cible
    public String addParticipantToTarget(Long id_cible, JointureCalendrier jointureCalendrier) {
        jointureCalendrierRepository.save(jointureCalendrier);
        return "Participant ajouté avec succès";
    }

    // Définir un marqueur pour la cible
    public String defineMarker(Long id_cible, JointureCalendrier jointureCalendrier) {
        // Logique pour définir un marqueur
        return "Marqueur défini avec succès";
    }

    // Supprimer un participant de la cible
    public String deleteParticipantFromTarget(Long id_cible, JointureCalendrier jointureCalendrier) {
        jointureCalendrierRepository.delete(jointureCalendrier);
        return "Participant supprimé avec succès";
    }
    public Cibles saveCible(Cibles cible) {
        return ciblesRepository.save(cible);
    }

    // Mettre à jour une cible
    public Cibles updateCible(Long id, Cibles cible) {
        cible.setId(id);
        return ciblesRepository.save(cible);
    }

    // Supprimer une cible
    public void deleteCible(Long id) {
        ciblesRepository.deleteById(id);
    }

    // Récupérer une cible par ID
    public Cibles getCibleById(Long id) {
        return ciblesRepository.findById(id).orElse(null);
    }

    // Récupérer tous les cibles
    public List<Cibles> getAllCibles() {
        return ciblesRepository.findAll();
    }

}
