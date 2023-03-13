package com.example.studentms.service;

import com.example.studentms.dao.IStudentDao;
import com.example.studentms.entity.Student;
import com.example.studentms.exception.InvalidAgeException;
import com.example.studentms.exception.InvalidNameException;
import com.example.studentms.exception.InvalidIdException;
import com.example.studentms.exception.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements IStudentService{
    @Autowired
    IStudentDao studentDao;
    @Override
    public Student addStudent(String name, int age) {
        validateName(name);
        validateAge(age);
        Student student = new Student(name,age);
        studentDao.add(student);
        return student;
    }

    @Override
    public Student findById(int id) throws StudentNotFoundException{
        validateId(id);
        Student student = studentDao.findById(id);
        if(student==null){
            throw new StudentNotFoundException("Student not found");
        }
        return student;
    }

    @Override
    public Student changeAge(int id, int age) throws StudentNotFoundException {
        validateId(id);
        validateAge(age);
        Student student = findById(id);
        student.setAge(age);
        studentDao.update(student);
        return student;
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public void deleteStudent(int id) throws StudentNotFoundException {
     Student student = findById(id);
     studentDao.remove(student);
    }
    void validateId(int id){
        if(id<0){
            throw new InvalidIdException("Id is invalid");
        }
    }
    void validateAge(int age){
        if(age<0){
            throw new InvalidAgeException("Age is invalid");
        }
    }
    void validateName(String name){
        if(name.length()<2 || name.length()>10){
            throw new InvalidNameException("Name is invalid");
        }
    }
}
