package UFOLEP_POLYTECH.Repositories;

import UFOLEP_POLYTECH.Model.ControleClavier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControleClavierRepository extends JpaRepository<ControleClavier, Long> {

    // Rechercher un contrôle clavier par événement et licence
    ControleClavier findByIdEvenementAndLicence(Long idEvenement, String licence);
    
    // Rechercher un contrôle clavier par licence
    ControleClavier findByLicence(String licence);
    
    // Supprimer un contrôle clavier par événement et licence
    void deleteByIdEvenementAndLicence(Long idEvenement, String licence);
}
