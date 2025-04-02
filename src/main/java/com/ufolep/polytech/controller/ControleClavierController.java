package com.ufolep.polytech.controller;

import com.ufolep.polytech.model.ControleClavier;
import com.ufolep.polytech.service.ControleClavierService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/controleclavier")
public class ControleClavierController {

    @Autowired
    private ControleClavierService controleClavierService;

    // Enregistrer un contrôle clavier
    @PostMapping
    public ControleClavier saveControleClavier(@RequestBody ControleClavier controleClavier) {
        return controleClavierService.saveControleClavier(controleClavier);
    }

    // Récupérer un contrôle clavier par événement et licence
    @GetMapping("/{id_evenement}/{licence}")
    public ControleClavier getControleClavier(@PathVariable Long id_evenement, @PathVariable String licence) {
        return controleClavierService.getControleClavierByEventAndLicence(id_evenement, licence);
    }

    // Supprimer un contrôle clavier
    @DeleteMapping("/{id}")
    public void deleteControleClavier(@PathVariable Long id) {
        controleClavierService.deleteControleClavier(id);
    }
}
