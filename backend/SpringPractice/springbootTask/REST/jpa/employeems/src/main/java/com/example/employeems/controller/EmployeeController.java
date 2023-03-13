package com.example.employeems.controller;

import com.example.employeems.entity.Employee;
import com.example.employeems.exception.EmployeeNotFoundException;
import com.example.employeems.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    IEmployeeService employeeService;

    @PostMapping(value = "/add",consumes = "application/json",produces="application/json")
    public Employee add(@RequestBody Employee requestData) {
        Employee response = employeeService.add(requestData.getName(), requestData.getSalary());
        return response;
    }

    @GetMapping("/findbyid/{id}")
    public Employee findById(@PathVariable int id)throws EmployeeNotFoundException {
        Employee employee = employeeService.findById(id);
        return employee;
    }
    
    @GetMapping("/findbyname/{name}")
    public List<Employee> findByName(@PathVariable String name){
        List<Employee> response = employeeService.findByName(name);
        return  response;
    }
    @PutMapping("/update/salary/{id}")
    public Employee update(@PathVariable int id,@RequestBody Employee requestdata)throws EmployeeNotFoundException{
        Employee response = employeeService.updateSalary(id,requestdata.getSalary());
        return response;
    }
    @DeleteMapping("/deletebyid/{id}")
    public String delete(@PathVariable int id)throws EmployeeNotFoundException{
        String msg = employeeService.delete(id);
        return msg;
    }
    @GetMapping("/findall")
    public List<Employee> findAll(){
        List<Employee> response = employeeService.findAll();
        return response;
    }



}
