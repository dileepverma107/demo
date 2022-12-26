package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {
    public Student getStudent(String name, String position) {
        Student student = new Student();
        student.setName(name);
        student.setPosition(position);
        return student;
    }
}
