package com.example.buysell.repositories;

import com.example.buysell.models.Passanger;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PassangerRepository extends JpaRepository<Passanger, Long> {
    List<Passanger> findByTitle(String title);
}
