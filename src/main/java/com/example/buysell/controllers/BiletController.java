package com.example.buysell.controllers;

import com.example.buysell.models.Bilet;
import com.example.buysell.services.BiletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bilets")
public class BiletController {
    @Autowired
    private BiletService biletService;

    @GetMapping
    public List<Bilet> getAllBilets() {
        return biletService.getAllBilets();
    }

    @GetMapping("/{biletId}")
    public Bilet getBiletById(@PathVariable Long biletId) {
        return biletService.getBiletById(biletId);
    }
}
