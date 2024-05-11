package com.example.buysell.controllers;

import com.example.buysell.models.Passanger;
import com.example.buysell.services.PassangerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/passangers")
public class PassangerController {
    @Autowired
    private PassangerService passangerService;

    @GetMapping
    public List<Passanger> getAllPassangers() {
        return passangerService.getAllPassangers();
    }

    @GetMapping("/{passangerId}")
    public Passanger getPassangerById(@PathVariable Long passangerId) {
        return passangerService.getPassangerById(passangerId);
    }
}
