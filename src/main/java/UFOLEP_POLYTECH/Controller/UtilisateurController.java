package UFOLEP_POLYTECH.Controller;

import UFOLEP_POLYTECH.Model.ClubsUtilisateur;
import UFOLEP_POLYTECH.Service.ClubsUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateurController {

    @Autowired
    private ClubsUtilisateur utilisateurService;

    // Ajouter un nouvel utilisateur
    @PostMapping
    public ClubsUtilisateur createUtilisateur(@RequestBody ClubsUtilisateur utilisateur) {
        return utilisateurService.saveUtilisateur(utilisateur);
    }

    // Récupérer un utilisateur par son ID
    @GetMapping("/{id}")
    public ClubsUtilisateur getUtilisateurById(@PathVariable Long id) {
        return utilisateurService.getUtilisateurById(id);
    }

    // Mettre à jour un utilisateur (par exemple, changer le rôle)
    @PutMapping("/{id}")
    public Utilisateur updateUtilisateur(@PathVariable Long id, @RequestBody Utilisateur utilisateur) {
        return utilisateurService.updateUtilisateur(id, utilisateur);
    }
}
