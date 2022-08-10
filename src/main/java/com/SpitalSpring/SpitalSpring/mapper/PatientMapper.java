package com.SpitalSpring.SpitalSpring.mapper;

import com.SpitalSpring.SpitalSpring.dto.PatientDTO;
import com.SpitalSpring.SpitalSpring.model.Patient;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper {

    PatientDTO toPatientDTO(Patient patient);
}
