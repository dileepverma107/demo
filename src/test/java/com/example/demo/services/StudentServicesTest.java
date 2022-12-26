package com.example.demo.services;

import com.example.demo.model.Student;
import com.example.demo.service.StudentServices;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class StudentServicesTest {

    @Mock
    private StudentServices studentServices;

    @Test
    void testStudent() {
        String name = "Dileep";
        String position = "Software Developer";
        Student expected = new Student();
        expected.setName(name);
        expected.setPosition(position);
        Student actual = studentServices.getStudent(name, position);
    }
}
