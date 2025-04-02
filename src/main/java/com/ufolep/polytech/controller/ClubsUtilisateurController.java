package com.ufolep.polytech.controller;

import com.ufolep.polytech.model.ClubsUtilisateur;
import com.ufolep.polytech.service.ClubsUtilisateurService;

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
