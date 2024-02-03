package com.example.mallergy.Patient;

public class AllergyModel {

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
