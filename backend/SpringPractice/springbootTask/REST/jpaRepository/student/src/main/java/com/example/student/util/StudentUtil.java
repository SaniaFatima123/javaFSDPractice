package com.example.student.util;

import com.example.student.dto.StudentDetails;
import com.example.student.entity.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentUtil {
    public StudentDetails toStudentDetails(Student student){
        StudentDetails studentDetails = new StudentDetails(student.getId(), student.getName(), student.getAge(),
                student.getSchool(), student.getStandard());
        return studentDetails;
    }
    public List<StudentDetails> toStudentDetails(List<Student> students){
        List<StudentDetails> studentDetailsList = new ArrayList<>();
        for(Student student:students){
            StudentDetails studentDetails = new StudentDetails(student.getId(), student.getName(), student.getAge(),
                    student.getSchool(), student.getStandard());
            studentDetailsList.add(studentDetails);
        }
        return studentDetailsList;
    }
}
