package com.example.springsecurityapplication.Student;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "Rishabh jain"),
            new Student(2,"Shreya jain"),
            new Student(3, "Rajan Mishra")
    );

    @GetMapping(path= "{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer studentid)
    {
      return STUDENTS.stream().filter(student -> studentid.equals(student.getStudentId()))
            .findFirst()
            .orElseThrow(()-> new IllegalStateException("Student "+ studentid +"does not exist"));
    }
}
