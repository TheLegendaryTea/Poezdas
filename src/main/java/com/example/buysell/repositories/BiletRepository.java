package com.example.buysell.repositories;

import com.example.buysell.models.Bilet;
import com.example.buysell.models.Bilet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BiletRepository extends JpaRepository<Bilet, Long> {
    List<Bilet> findByTitle(String title);
}
