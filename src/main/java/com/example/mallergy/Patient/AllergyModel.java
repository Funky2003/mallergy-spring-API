package com.example.mallergy.Patient;

import jakarta.persistence.*;

@Entity
@Table
public class AllergyModel {
    //<--Add the @Id attributes and specify the data creation sequence as well
    //<--Also initialize the @GeneratedValue method
    @Id
    @SequenceGenerator(
            name = "allergy_sequence",
            sequenceName = "allergy_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "allergy_sequence"
    )
    //<--Declare all needed variables
    private Long allergyId;
    private String allergyName;
    private String allergyDescription;

    //<--Generate the constructors for the class
    public AllergyModel() {
    }

    public AllergyModel(Long allergyId, String allergyName, String allergyDescription) {
        this.allergyId = allergyId;
        this.allergyName = allergyName;
        this.allergyDescription = allergyDescription;
    }

    public AllergyModel(String allergyName, String allergyDescription) {
        this.allergyName = allergyName;
        this.allergyDescription = allergyDescription;
    }

    //<--Generate the setters

    public Long getAllergyId() {
        return allergyId;
    }

    public void setAllergyId(Long allergyId) {
        this.allergyId = allergyId;
    }

    public String getAllergyName() {
        return allergyName;
    }

    public void setAllergyName(String allergyName) {
        this.allergyName = allergyName;
    }

    public String getAllergyDescription() {
        return allergyDescription;
    }

    public void setAllergyDescription(String allergyDescription) {
        this.allergyDescription = allergyDescription;
    }
}
