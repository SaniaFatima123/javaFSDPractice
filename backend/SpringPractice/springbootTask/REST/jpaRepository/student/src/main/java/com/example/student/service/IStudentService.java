package com.example.student.service;

import com.example.student.dto.AddStudentRequest;
import com.example.student.dto.StudentDetails;
import com.example.student.dto.UpdateStandardRequest;
import com.example.student.entity.Student;
import com.example.student.exception.StudentNotFoundException;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.repository.query.Param;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

public interface IStudentService {
    StudentDetails addStudent(@Valid AddStudentRequest requestData);

    Student findById(@Min(1) int id) throws StudentNotFoundException;

    StudentDetails findStudentById(@Min(1) int id) throws StudentNotFoundException;

    //StudentDetails updateStandard(int id, UpdateStandardRequest request) throws StudentNotFoundException;

    StudentDetails updateStandard(@Min(1) int id, @Valid UpdateStandardRequest requestData) throws StudentNotFoundException;

    List<StudentDetails> findAll();

    String deleteStudent(@Min(1) int id) throws StudentNotFoundException;

    List<StudentDetails> findByName(@Length(min=2) String name);

    List<StudentDetails> findByStandard(@Min(1)int standard);

    List<StudentDetails> findByStandardAndSchool(@Min(1)int standard, @Length(min=2)  String school);

    List<StudentDetails> findByStandardOrSchool(@Min(1)int standard, @Length(min=2) String school);

    List<StudentDetails> findAllStudent();

    List<StudentDetails> findAllStudentsByName(@Param("nameArgs") @Length(min=2)  String name);

}
