package com.example.buysell.services;

import com.example.buysell.models.Passanger;
import com.example.buysell.repositories.PassangerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassangerService {
    @Autowired
    private PassangerRepository passangerRepository;

    public List<Passanger> getAllPassangers() {
        return passangerRepository.findAll();
    }

    public Passanger getPassangerById(Long passangerId) {
        return passangerRepository.findById(passangerId)
                .orElseThrow(() -> new IllegalArgumentException("Passanger not found with id: " + passangerId));
    }

}
