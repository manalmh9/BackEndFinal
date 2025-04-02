package UFOLEP_POLYTECH.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UFOLEP_POLYTECH.Model.ControleClavier;
import UFOLEP_POLYTECH.Repositories.ControleClavierRepository;

@Service
public class ControleClavierService {

    @Autowired
    private ControleClavierRepository controleClavierRepository;

    // Enregistrer une nouvelle entrée de contrôle clavier
    public ControleClavier saveControleClavier(ControleClavier controleClavier) {
        return controleClavierRepository.save(controleClavier);
    }

    // Récupérer le contrôle clavier par événement et licence
    public ControleClavier getControleClavierByEventAndLicence(Long id_evenement, String licence) {
        return controleClavierRepository.findByIdEvenementAndLicence(id_evenement, licence);
    }

    // Supprimer un contrôle clavier
    public void deleteControleClavier(Long id) {
        controleClavierRepository.deleteById(id);
    }
}
