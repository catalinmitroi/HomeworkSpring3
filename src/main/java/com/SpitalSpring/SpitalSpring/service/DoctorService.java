package com.SpitalSpring.SpitalSpring.service;

import com.SpitalSpring.SpitalSpring.exceptions.NoDoctorException;
import com.SpitalSpring.SpitalSpring.model.Doctor;
import com.SpitalSpring.SpitalSpring.model.Patient;
import com.SpitalSpring.SpitalSpring.model.Speciality;
import com.SpitalSpring.SpitalSpring.observer.PatientObserver;
import com.SpitalSpring.SpitalSpring.repository.DoctorRepository;
import com.SpitalSpring.SpitalSpring.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {

    final DoctorRepository doctorRepository;

    final PatientRepository patientRepository;

    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }

    public void addPatient(Integer doctorId, Integer PatientId) throws NoDoctorException {
            Doctor d = doctorRepository.getById(doctorId);
            if(d==null)
                throw new NoDoctorException();
            else{
                Patient p = patientRepository.getById(PatientId);
                if( p != null){
                    d.addPatient(p);
                }
            }
    }

    public List<Doctor> getAllBySpeciality(Speciality speciality){
        return doctorRepository.getAllBySpeciality(speciality);
    }

    public void addDoctor(Doctor doctor){
        doctorRepository.save(doctor);
    }
}
