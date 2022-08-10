package com.SpitalSpring.SpitalSpring.repository;

import com.SpitalSpring.SpitalSpring.dto.PatientDTO;
import com.SpitalSpring.SpitalSpring.model.Doctor;
import com.SpitalSpring.SpitalSpring.model.Patient;
import com.SpitalSpring.SpitalSpring.model.Speciality;
import com.SpitalSpring.SpitalSpring.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
    List<Patient> findAll();

    Patient getById(Integer id);
    Patient getByCnp(String cnp);
    PatientDTO findByCnp(String cnp);
}
