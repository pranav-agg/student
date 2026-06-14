package com.sample.student.controller;

import com.sample.student.model.StudentResult;
import com.sample.student.repository.StudentResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*") // Allows your Vite React app to make requests
public class StudentResultController {

    @Autowired
    private StudentResultRepository repository;

    // GET: Retrieve all student results from MySQL
    @GetMapping
    public List<StudentResult> getAllResults() {
        return repository.findAll();
    }

    // POST: Accept a new student result payload and save it
    @PostMapping
    public ResponseEntity<StudentResult> createResult(@RequestBody StudentResult studentResult) {
        try {
            StudentResult savedResult = repository.save(studentResult);
            return new ResponseEntity<>(savedResult, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}