package com.example.mallergy.Patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllergyService {
    //<--To start, first initialize the Allergy repository
    private final AllergyRepository allergyRepository;

    @Autowired
    public AllergyService(AllergyRepository allergyRepository) {
        this.allergyRepository = allergyRepository;
    }

    //<--Method to get all the allergy records
    public List<AllergyModel> getAllAllergyRecords() {
        return allergyRepository.findAll();
    }
}
