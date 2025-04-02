package UFOLEP_POLYTECH.Controller;

import UFOLEP_POLYTECH.Model.ClubsUtilisateur;
import UFOLEP_POLYTECH.Service.ClubsUtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clubsUtilisateurs")
public class ClubsUtilisateurController {

    @Autowired
    private ClubsUtilisateurService clubsUtilisateurService;

    @PostMapping
    public ClubsUtilisateur addClubsUtilisateur(@RequestBody ClubsUtilisateur clubsUtilisateur) {
        return clubsUtilisateurService.saveClubsUtilisateur(clubsUtilisateur);
    }

    @PutMapping("/{id}")
    public ClubsUtilisateur updateClubsUtilisateur(@PathVariable Long id, @RequestBody ClubsUtilisateur clubsUtilisateur) {
        return clubsUtilisateurService.updateClubsUtilisateur(id, clubsUtilisateur);
    }

    @DeleteMapping("/{id}")
    public void deleteClubsUtilisateur(@PathVariable Long id) {
        clubsUtilisateurService.deleteClubsUtilisateur(id);
    }

    @GetMapping("/{id}")
    public ClubsUtilisateur getClubsUtilisateurById(@PathVariable Long id) {
        return clubsUtilisateurService.getClubsUtilisateurById(id);
    }

    @GetMapping
    public List<ClubsUtilisateur> getAllClubsUtilisateurs() {
        return clubsUtilisateurService.getAllClubsUtilisateurs();
    }
}
