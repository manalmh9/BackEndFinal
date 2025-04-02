package com.ufolep.polytech.controller;

import com.ufolep.polytech.model.Statut;
import com.ufolep.polytech.service.StatutService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/statuts")
public class StatutController {

    @Autowired
    private StatutService statutService;

    // Assigner un statut à un utilisateur
    @PostMapping
    public String assignStatutToUser(@RequestBody Statut statut) {
        return statutService.assignStatutToUser(statut);
    }

    // Obtenir le statut d'un utilisateur
    @GetMapping("/{user_id}")
    public Statut getStatutByUser(@PathVariable Long user_id) {
        return statutService.getStatutByUser(user_id);
    }
}
