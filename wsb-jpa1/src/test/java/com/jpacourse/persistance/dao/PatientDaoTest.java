package com.jpacourse.persistance.dao;

import com.jpacourse.persistance.entity.PatientEntity;
import com.jpacourse.persistance.Repository.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PatientRepositoryTest
{
    @Autowired
    private PatientRepository patientRepository;
    @Test
    public void testFindPatientsByLastName() {
        List<PatientEntity> patients = patientRepository.findByLastName("Nowak");
        assertFalse(patients.isEmpty());
        assertEquals("Nowak", patients.get(0).getLastName());
    }
}
@Test
public void testFetchModeSelect()
{
    PatientEntity patient = patientRepository.findById(1L).orElseThrow();
    System.out.println("Patient: " + patient.getFirstName() + " " + patient.getLastName());
    System.out.println("Visits count: " + patient.getVisits().size());
}
