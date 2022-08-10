package com.SpitalSpring.SpitalSpring.service;

import com.SpitalSpring.SpitalSpring.dto.PatientDTO;
import com.SpitalSpring.SpitalSpring.mapper.PatientMapper;
import com.SpitalSpring.SpitalSpring.model.Doctor;
import com.SpitalSpring.SpitalSpring.model.Patient;
import com.SpitalSpring.SpitalSpring.model.Speciality;
import com.SpitalSpring.SpitalSpring.model.Visit;
import com.SpitalSpring.SpitalSpring.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PatientService {
    final PatientRepository patientRepository;

    final PatientMapper patientMapper;

   /* public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }*/

    public List<PatientDTO> getAllPatients(){
        return patientRepository.findAll().stream()
                .map(patientMapper::toPatientDTO)
                .collect(Collectors.toList());
    }

   /* public PatientDTO findByCnp(String cnp){
        return patientRepository.findByCnp(cnp);
    }*/

     public Patient getByCnp(String cnp){
            return patientRepository.getByCnp(cnp);
    }

    public Patient addPatient(Patient patient){
      return patientRepository.save(patient);
    }

}
