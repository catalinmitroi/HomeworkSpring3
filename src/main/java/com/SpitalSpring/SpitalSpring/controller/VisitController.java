package com.SpitalSpring.SpitalSpring.controller;

import com.SpitalSpring.SpitalSpring.model.Speciality;
import com.SpitalSpring.SpitalSpring.model.Visit;
import com.SpitalSpring.SpitalSpring.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VisitController {
    @Autowired
    VisitService visitService;

   // display all visits of a patient by cnp and speciality

    @GetMapping("visits")
    public List<Visit> getAllVisitByCnpAndSpeciality(@RequestParam String cnp, @RequestParam Speciality speciality){
        return visitService.getVisitsByCnpAndSpeciality(cnp, speciality);
    }


    @PostMapping("visits/add")
    public Visit addVisit(@RequestBody Visit visit){
        return visitService.addVisit(visit);
    }

}
