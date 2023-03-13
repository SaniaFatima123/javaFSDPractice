package com.example.student.service;

import com.example.student.dto.AddStudentRequest;
import com.example.student.dto.StudentDetails;
import com.example.student.dto.UpdateStandardRequest;
import com.example.student.entity.Student;
import com.example.student.exception.StudentNotFoundException;
import com.example.student.repository.StudentRepository;
import com.example.student.util.StudentUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentRepository repository;
    @Autowired
    private StudentUtil util;

    @Override
    public StudentDetails addStudent(AddStudentRequest requestData) {
        Student student = new Student(requestData.getName(), requestData.getAge(), requestData.getSchool(), requestData.getStandard());
        Student addedStudent = repository.save(student);
        StudentDetails studentDetails = util.toStudentDetails(addedStudent);
        return studentDetails;
    }

    @Override
    public Student findById(int id) throws StudentNotFoundException {
        Optional<Student> student = repository.findById(id);
        if (!student.isPresent()) {
            throw new StudentNotFoundException("Student not found with id " + id);
        }
        return student.get();
    }

    @Override
    public StudentDetails findStudentById(int id) throws StudentNotFoundException {
        Student student = findById(id);
        StudentDetails studentDetails = util.toStudentDetails(student);
        return studentDetails;
    }

    /*@Override
    public StudentDetails updateStandard(int id, UpdateStandardRequest request) throws StudentNotFoundException {
        Student student = findById(id);
        student.setStandard(request.getStandard());
        Student updated  = repository.save(student);
        StudentDetails studentDetails = util.toStudentDetails(updated);
        return studentDetails;
    }*/
    @Override
    public StudentDetails updateStandard(int id, UpdateStandardRequest requestData) throws StudentNotFoundException {
        Student student=findById(id);
        student.setAge(requestData.getStandard());
        Student updatedStudent=repository.save(student);
        StudentDetails userDetails = util.toStudentDetails(updatedStudent);
        return userDetails;
    }

    @Override
    public List<StudentDetails> findAll() {
        List<Student> foundAll = repository.findAll();
        List<StudentDetails> studentDetails = util.toStudentDetails(foundAll);
        return studentDetails;
    }

    @Override
    public String deleteStudent(int id) throws StudentNotFoundException {
        Student student = findById(id);
        repository.delete(student);
        return "Student deleted with id "+id ;
    }

    @Override
    public List<StudentDetails> findByName(String name) {
        List<Student> foundByName = repository.findByName(name);
        List<StudentDetails> studentDetails = util.toStudentDetails(foundByName);
        return studentDetails;
    }

    @Override
    public List<StudentDetails> findByStandard(int standard) {
        List<Student> foundByStandard = repository.findByStandard(standard);
        List<StudentDetails> studentDetails = util.toStudentDetails(foundByStandard);
        return studentDetails;
    }

    @Override
    public List<StudentDetails> findByStandardAndSchool(int standard, String school){
        List<Student> foundByStandardAndSchool = repository.findByStandardAndSchool(standard,school);
        List<StudentDetails> studentDetails = util.toStudentDetails(foundByStandardAndSchool);
        return studentDetails;
    }

    @Override
    public List<StudentDetails> findByStandardOrSchool(int standard, String school){
        List<Student> foundByStandardOrSchool = repository.findByStandardOrSchool(standard,school);
        List<StudentDetails> studentDetails = util.toStudentDetails(foundByStandardOrSchool);
        return studentDetails;
    }

    @Override
    public List<StudentDetails> findAllStudent() {
        List<Student> foundAllUsers = repository.findAllStudent();
        List<StudentDetails> studentDetails = util.toStudentDetails(foundAllUsers);
        return studentDetails;
    }

    @Override
    public List<StudentDetails> findAllStudentsByName(String name) {
        List<Student> foundAllUsersByName = repository.findAllStudentsByName(name);
        List<StudentDetails> studentDetails = util.toStudentDetails(foundAllUsersByName);
        return studentDetails;
    }

}
