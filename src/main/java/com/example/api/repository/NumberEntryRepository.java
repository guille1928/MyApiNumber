package com.example.api.repository;

import com.example.api.model.NumberEntry;
import org.springframework.data.jpa.repository.JpaRepository;




public interface NumberEntryRepository extends JpaRepository<NumberEntry, Long> {
    // You can add custom queries here if needed
}