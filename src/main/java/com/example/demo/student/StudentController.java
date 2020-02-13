/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.student;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author krawler
 */
@RestController
@RequestMapping("api/students")
public class StudentController {
    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "Rahul"),
            new Student(2, "Sachin"),
            new Student(3, "Medha")
    );
    
    @GetMapping(path = "{sId}")
    public Student getStudent(@PathVariable("sId") Integer sID){
        return STUDENTS.stream()
                .filter(student -> sID.equals(student.getsId()))
                .findFirst()
                .orElseThrow(()-> new IllegalStateException("Student not found"));
    }
    
}
