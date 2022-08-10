package com.SpitalSpring.SpitalSpring.service;

import com.SpitalSpring.SpitalSpring.dto.PatientDTO;
import com.SpitalSpring.SpitalSpring.exceptions.NoDoctorException;
import com.SpitalSpring.SpitalSpring.model.Doctor;
import com.SpitalSpring.SpitalSpring.model.Patient;
import com.SpitalSpring.SpitalSpring.model.Speciality;
import com.SpitalSpring.SpitalSpring.model.Visit;
import com.SpitalSpring.SpitalSpring.repository.DoctorRepository;
import com.SpitalSpring.SpitalSpring.repository.PatientRepository;
import com.SpitalSpring.SpitalSpring.repository.VisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VisitService {

    final VisitRepository visitRepository;
    final PatientRepository patientRepository;

    final DoctorRepository doctorRepository;

    public List<Visit> getVisitsByCnpAndSpeciality(String cnp, Speciality speciality){
        PatientDTO p = patientRepository.findByCnp(cnp);
        if(p.getDoctorSpeciality() == speciality) {
            p.setCnp(cnp);
            p.setDoctorSpeciality(speciality);
        }
        return visitRepository.findByCnpAndSpeciality(p.getCnp(),p.getDoctorSpeciality());
    }

    public Visit addVisit(Visit visit){
        return visitRepository.save(visit);
    }
}
