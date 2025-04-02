package UFOLEP_POLYTECH.Controller;

import UFOLEP_POLYTECH.Service.ClubsUtilisateurService;
import UFOLEP_POLYTECH.Model.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/participants")
public class ClubsUtilisateurController {

    @Autowired
    private ClubsUtilisateurService clubsUtilisateurService;

    // Récupérer les scores d'un utilisateur
    @GetMapping("/{user_license}/scores")
    public Score getScore(@PathVariable String user_license, 
                          @RequestParam Long id_evenement, 
                          @RequestParam Long id_cible, 
                          @RequestParam Long depart) {
        return clubsUtilisateurService.getScore(user_license, id_evenement, id_cible, depart);
    }

    // Enregistrer un score pour un utilisateur
    @PostMapping("/{user_license}/scores")
    public String saveScore(@PathVariable String user_license, 
                            @RequestBody Score score) {
        return clubsUtilisateurService.saveScore(user_license, score);
    }

    // Mettre à jour un score
    @PatchMapping("/{user_license}/scores")
    public String updateScore(@PathVariable String user_license, 
                              @RequestBody Score score) {
        return clubsUtilisateurService.updateScore(user_license, score);
    }

    // Obtenir des informations sur les étapes de l'utilisateur
    @GetMapping("/{user_license}/scores/info")
    public String getStepInfo(@PathVariable String user_license,
                              @RequestParam Long id_evenement, 
                              @RequestParam Long id_cible,
                              @RequestParam Long depart) {
        return clubsUtilisateurService.getStepInfo(user_license, id_evenement, id_cible, depart);
    }
}
