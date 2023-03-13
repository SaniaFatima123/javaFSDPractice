package com.example.studentms.dao;

import com.example.studentms.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public class StudentDaoImpl implements IStudentDao {
    private Map<Integer,Student> students = new HashMap();

    private int generatedid;
    private int generateID(){
        return ++generatedid;
    }

    @Override
    public void add(Student student) {
        int id = generateID();
        student.setId(id);
        students.put(id,student);
    }

    @Override
    public Student findById(int id) {
        Student found = students.get(id);
        return found;
    }

    @Override
    public Student update(Student student) {
       Student updated =  students.put(student.getId(),student);
        return updated;
    }

    @Override
    public List<Student> findAll() {
        Collection<Student> found = students.values();
        List<Student> foundList = new ArrayList<>(found);
        return foundList;
    }

    @Override
    public void remove(Student student) {

        students.remove(student);
    }
}
