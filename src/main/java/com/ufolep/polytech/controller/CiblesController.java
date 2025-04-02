package com.ufolep.polytech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.ufolep.polytech.service.*;
import com.ufolep.polytech.model.*;

import java.util.List;

@RestController
@RequestMapping("/cibles")
public class CiblesController {

    @Autowired
    private CiblesService ciblesService;

    @PostMapping
    public Cibles addCible(@RequestBody Cibles cible) {
        return ciblesService.saveCible(cible);
    }

    @PutMapping("/{id}")
    public Cibles updateCible(@PathVariable Long id, @RequestBody Cibles cible) {
        return ciblesService.updateCible(id, cible);
    }

    @DeleteMapping("/{id}")
    public void deleteCible(@PathVariable Long id) {
        ciblesService.deleteCible(id);
    }

    @GetMapping("/{id}")
    public Cibles getCibleById(@PathVariable Long id) {
        return ciblesService.getCibleById(id);
    }

    @GetMapping
    public List<Cibles> getAllCibles() {
        return ciblesService.getAllCibles();
    }

   
}
