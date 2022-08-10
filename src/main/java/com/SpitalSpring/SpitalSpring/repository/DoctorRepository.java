package com.SpitalSpring.SpitalSpring.repository;

import com.SpitalSpring.SpitalSpring.model.Doctor;
import com.SpitalSpring.SpitalSpring.model.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.print.Doc;
import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    List<Doctor> findAll();

    Doctor getById(Integer integer);

    List<Doctor> getAllBySpeciality(Speciality speciality);
}
