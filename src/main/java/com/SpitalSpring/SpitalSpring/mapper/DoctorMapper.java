package com.SpitalSpring.SpitalSpring.mapper;

import com.SpitalSpring.SpitalSpring.dto.DoctorDTO;
import com.SpitalSpring.SpitalSpring.model.Doctor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DoctorMapper {
    DoctorDTO toDoctorDTO(Doctor doctor);
}
