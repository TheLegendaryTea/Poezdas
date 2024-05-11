package com.example.buysell.services;

import com.example.buysell.models.Bilet;
import com.example.buysell.repositories.BiletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BiletService {
    @Autowired
    private BiletRepository biletRepository;

    public List<Bilet> getAllBilets() {
        return biletRepository.findAll();
    }

    public Bilet getBiletById(Long biletId) {
        return biletRepository.findById(biletId)
                .orElseThrow(() -> new IllegalArgumentException("Bilet not found with id: " + biletId));
    }

}
