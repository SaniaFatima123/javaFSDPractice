package com.example.studentms.service;

import com.example.studentms.entity.Student;
import com.example.studentms.exception.StudentNotFoundException;

import java.util.List;

public interface IStudentService {
    Student addStudent(String name, int age);
    Student findById(int id) throws StudentNotFoundException;
    Student changeAge(int id,int age) throws StudentNotFoundException;
    List<Student> findAll();
    void deleteStudent(int id) throws StudentNotFoundException;
}
