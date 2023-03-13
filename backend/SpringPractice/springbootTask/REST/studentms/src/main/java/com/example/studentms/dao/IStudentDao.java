package com.example.studentms.dao;

import com.example.studentms.entity.Student;

import java.util.List;

public interface IStudentDao {
    void add(Student student);
    Student findById(int id);
    Student update(Student student);
    List<Student> findAll();
    void remove(Student student);

}
