package com.example.mallergy.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping
    private String getStudent() {
        return "Hello Spring";
    }
}
