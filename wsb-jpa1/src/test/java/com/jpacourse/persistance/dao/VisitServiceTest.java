package com.jpacourse.persistance.dao;

import com.jpacourse.persistance.entity.VisitEntity;
import com.jpacourse.persistance.service.VisitService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class VisitServiceTest {

    @Autowired
    private VisitService visitService;

    @Test
    void testFindAllVisitsByPatientId() {
        Long patientId = 1L; // Replace with valid patient ID from your dataset
        List<VisitEntity> visits = visitService.findVisitsByPatientId(patientId);

        assertNotNull(visits);
        assertFalse(visits.isEmpty());
        assertEquals(patientId, visits.get(0).getPatient().getId());
    }
}