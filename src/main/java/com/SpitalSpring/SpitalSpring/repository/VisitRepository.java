package com.SpitalSpring.SpitalSpring.repository;

import com.SpitalSpring.SpitalSpring.model.Speciality;
import com.SpitalSpring.SpitalSpring.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VisitRepository extends JpaRepository<Visit, Integer> {
    List<Visit> findAll();

    List<Visit> findByCnpAndSpeciality(String cnp, Speciality doctorSpeciality);
}
