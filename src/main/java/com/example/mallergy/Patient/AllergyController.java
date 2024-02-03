package com.example.mallergy.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/allergy")
public class AllergyController {

    //<--Initialize the allergy services and with the constructor
    //<--Also Autowire the constructor
    private final AllergyService allergyService;
    @Autowired
    public AllergyController(AllergyService allergyService) {
        this.allergyService = allergyService;
    }

    //<--Create the action to get all allergies with a @GetMapping annotation
    @GetMapping
    public List<AllergyModel> getAllergy() {
        return allergyService.getAllAllergyRecords();
    }
}
