package com.example.buysell.services;

import com.example.buysell.models.Bilet;
import com.example.buysell.models.Poezda;
import com.example.buysell.repositories.PoezdaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoezdaService {
    @Autowired
    private PoezdaRepository poezdaRepository;

    public List<Bilet> getAllPoezdas() {
        return poezdaRepository.findAll();
    }

    public Poezda getPoezdaById(Long poezdaId) {
        return poezdaRepository.findById(poezdaId)
                .orElseThrow(() -> new IllegalArgumentException("Poezda not found with id: " + poezdaId));
    }

}
