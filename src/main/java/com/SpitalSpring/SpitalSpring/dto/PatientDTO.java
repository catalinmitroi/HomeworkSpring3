package com.SpitalSpring.SpitalSpring.dto;

import com.SpitalSpring.SpitalSpring.model.Patient;
import com.SpitalSpring.SpitalSpring.model.Speciality;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PatientDTO {
    String cnp;
    String doctorName;
    Speciality doctorSpeciality;

    public PatientDTO() {
    }

    public PatientDTO(Patient patient) {
        this.cnp = patient.getCnp();
        this.doctorName = patient.getDoctor().getName();
        this.doctorSpeciality = patient.getDoctor().getSpeciality();
    }

}
