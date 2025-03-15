package com.rem.springbootdocker.controller;

import com.rem.springbootdocker.dto.StudentDTO;
import com.rem.springbootdocker.model.Student;
import com.rem.springbootdocker.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping("/students")
    public String createStudent(@RequestBody StudentDTO student) {
        studentService.createStudent(student);
        return "Student created successfully";
    }
}
