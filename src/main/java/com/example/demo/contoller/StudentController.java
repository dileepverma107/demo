package com.example.demo.contoller;


import com.example.demo.model.Student;
import com.example.demo.service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentServices studentServices;

    @GetMapping("/students")
    public Student fetchStudents(@RequestParam(name="name", required = true) String name, @RequestParam(name = "position") String position) {
        Student student = studentServices.getStudent(name, position);
        return student;
    }
}
