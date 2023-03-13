package com.example.studentms.controller;

import com.example.studentms.entity.Student;
import com.example.studentms.exception.StudentNotFoundException;
import com.example.studentms.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    IStudentService studentService;

    //complete URL
    //http://localhost:8585/student/add put this link in Postman
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student requestStudent){
    Student student = studentService.addStudent(requestStudent.getName(), requestStudent.getAge());
    return student;
    }

    @GetMapping("/find/{id}")
    public Student findByID(@PathVariable int id)throws Exception{
     Student student = studentService.findById(id);
     return student;
    }

    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable int id,@RequestBody Student requestData)throws Exception {
       Student student = studentService.changeAge(id, requestData.getAge());
       return student;
    }

    @GetMapping("/findall")
    public List<Student> findAllStudent(){
       List<Student> foundAll = studentService.findAll();
       return foundAll;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id)throws StudentNotFoundException {
        studentService.deleteStudent(id);
        return "Student at id "+id+" is DELETED";
    }

}
