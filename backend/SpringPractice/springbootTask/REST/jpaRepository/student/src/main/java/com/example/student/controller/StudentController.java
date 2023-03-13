package com.example.student.controller;

import com.example.student.dto.AddStudentRequest;
import com.example.student.dto.StudentDetails;
import com.example.student.dto.UpdateStandardRequest;
import com.example.student.exception.StudentNotFoundException;
import com.example.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private IStudentService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add")
    public StudentDetails addStudent(@RequestBody AddStudentRequest request){
        StudentDetails response = service.addStudent(request);
        return response;
    }

    @GetMapping("/findbyid/{id}")
    public StudentDetails findById(@PathVariable int id)throws Exception{
        StudentDetails response = service.findStudentById(id);
        return response;
    }

    /*@PutMapping("/update/{id}")
    public StudentDetails updateStudentStandard(@PathVariable int id, @RequestBody UpdateStandardRequest request) throws Exception{
        StudentDetails response = service.updateStandard(id,request);
        return response;
    }*/

    @PutMapping("/update/standard/{id}")
    public StudentDetails updateStandard(@PathVariable int id, @RequestBody UpdateStandardRequest requestData) throws Exception {
        StudentDetails response=service.updateStandard(id,requestData);
        return response;
    }

    @GetMapping("/findall")
    public List<StudentDetails> findAllStudents(){
        List<StudentDetails> response = service.findAll();
        return response;
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/deletebyid/{id}")
    public String deleteStudent(@PathVariable int id)throws Exception{
       String msg = service.deleteStudent(id);
       return msg;
    }

    @GetMapping("/findbyname/{name}")
    public List<StudentDetails> findByName(@PathVariable String name){
        List<StudentDetails> response = service.findByName(name);
        return response;
    }

    @GetMapping("/findbystandard/{standard}")
    public List<StudentDetails> findByStandard(@PathVariable int standard){
        List<StudentDetails> response = service.findByStandard(standard);
        return response;
    }

    @GetMapping("/findbystandardandschool/{standard}/{school}")
    public List<StudentDetails> findByStandardAndSchool(@PathVariable int standard, @PathVariable String school){
        List<StudentDetails> response = service.findByStandardAndSchool(standard,school);
        return response;
    }

    @GetMapping("/findbystandardorschool/{standard}/{school}")
    public List<StudentDetails> findByStandardOrSchool(@PathVariable int standard, @PathVariable String school){
        List<StudentDetails> response = service.findByStandardOrSchool(standard,school);
        return response;
    }

    @GetMapping("/findallstudent")
    public List<StudentDetails> findAllStudent(){
        List<StudentDetails> response = service.findAllStudent();
        return response;
    }

    @GetMapping("/findallstudents/byname/{name}")
    public List<StudentDetails> findStudentByName(@PathVariable String name){
        List<StudentDetails> response = service.findAllStudentsByName(name);
        return response;
    }
}
