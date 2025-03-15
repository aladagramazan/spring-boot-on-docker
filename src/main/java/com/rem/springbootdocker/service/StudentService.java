package com.rem.springbootdocker.service;

import com.rem.springbootdocker.dto.StudentDTO;
import com.rem.springbootdocker.model.Student;
import com.rem.springbootdocker.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void createStudent(StudentDTO studentDTO) {
        Student student = Student.builder()
                .firstname(studentDTO.getFirstname())
                .lastname(studentDTO.getLastname())
                .emailAddress(studentDTO.getEmailAddress())
                .build();

        studentRepository.saveAndFlush(student);
    }
}
