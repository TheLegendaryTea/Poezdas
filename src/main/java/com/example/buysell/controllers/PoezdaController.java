package com.example.buysell.controllers;

import com.example.buysell.models.Bilet;
import com.example.buysell.models.Poezda;
import com.example.buysell.services.PoezdaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/poezdas")
public class PoezdaController {
    @Autowired
    private PoezdaService poezdaService;

    @GetMapping
    public List<Bilet> getAllPoezdas() {
        return poezdaService.getAllPoezdas();
    }

    @GetMapping("/{poezdaId}")
    public Poezda getPoezdaById(@PathVariable Long poezdaId) {
        return poezdaService.getPoezdaById(poezdaId);
    }
}