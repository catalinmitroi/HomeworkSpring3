package com.SpitalSpring.SpitalSpring.controller;

import com.SpitalSpring.SpitalSpring.exceptions.NoDoctorException;
import com.SpitalSpring.SpitalSpring.model.Doctor;
import com.SpitalSpring.SpitalSpring.model.Patient;
import com.SpitalSpring.SpitalSpring.model.Speciality;
import com.SpitalSpring.SpitalSpring.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @GetMapping("/doctors/all")
    public List<Doctor> getAllDoctors(){
        return doctorService.getAllDoctors();
    }

    @GetMapping("/doctors")
    public List<Doctor> getAllBySpeciality(@RequestParam Speciality speciality){
        return doctorService.getAllBySpeciality(speciality);
    }

    @PostMapping("/doctors/addPatient/{doctorId}/{patientId}")
    public boolean addPatient(@PathVariable ("doctorId") Integer doctorId, @PathVariable("patientId") Integer patientId) throws NoDoctorException {
        doctorService.addPatient(doctorId,patientId);
        return true;
    }

    @PostMapping("/doctors/addDoctor")
    public void addDoctor(@RequestBody Doctor doctor ){
        doctorService.addDoctor(doctor);
    }

}
