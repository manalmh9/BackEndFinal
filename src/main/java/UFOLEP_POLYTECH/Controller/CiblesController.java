package UFOLEP_POLYTECH.Controller;

import UFOLEP_POLYTECH.Model.Cibles;
import UFOLEP_POLYTECH.Service.CiblesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cibles")
public class CiblesController {

    @Autowired
    private CiblesService ciblesService;

    // Ajouter une cible
    @PostMapping
    public Cibles createCible(@RequestBody Cibles cible) {
        return ciblesService.addCible(cible);
    }

    // Récupérer les cibles par événement et cible
    @GetMapping("/{id_evenement}/{cible}")
    public List<Cibles> getCibles(@PathVariable Long id_evenement, @PathVariable String cible) {
        return ciblesService.getCibles(id_evenement, cible);
    }

    // Supprimer une cible
    @DeleteMapping("/{id}")
    public String deleteCible(@PathVariable Long id) {
        ciblesService.deleteCible(id);
        return "Cible supprimée avec succès";
    }
}
