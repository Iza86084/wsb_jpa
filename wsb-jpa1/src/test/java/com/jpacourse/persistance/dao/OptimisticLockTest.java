package com.jpacourse.persistance.dao;

import com.jpacourse.persistance.entity.VisitEntity;
import com.jpacourse.persistance.repository.VisitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import jakarta.persistence.OptimisticLockException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class OptimisticLockTest {

    @Autowired
    private VisitRepository visitRepository;

    @Test
    void testOptimisticLocking() {
        VisitEntity visit = visitRepository.findById(1L).orElseThrow(); // Adjust ID
        visit.setDescription("Updated description");

        VisitEntity anotherVisitInstance = visitRepository.findById(1L).orElseThrow(); // Adjust ID
        anotherVisitInstance.setDescription("Another update");

        visitRepository.save(visit);

        assertThrows(OptimisticLockException.class, () -> {
            visitRepository.save(anotherVisitInstance);
        });
    }
}