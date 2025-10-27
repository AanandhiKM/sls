package com.example.studentsback.controller;

import com.example.studentsback.model.Student;
import com.example.studentsback.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @PostMapping("/register")
    public String register(@RequestBody Student student) {
        repository.register(student);
        return "Registration successful!";
    }

    @PostMapping("/login")
    public String login(@RequestBody Student student) {
        boolean valid = repository.login(student.getRegisterNumber(), student.getPassword());
        return valid ? "Login successful!" : "Invalid credentials!";
    }
}
