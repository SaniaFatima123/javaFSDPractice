package com.example.employeems.service;

import com.example.employeems.entity.Employee;
import com.example.employeems.exception.EmployeeNotFoundException;

import java.util.List;

public interface IEmployeeService {
    Employee add(String name, double salary);
    Employee findById(int id)throws EmployeeNotFoundException;
    List<Employee> findByName(String name);
    Employee updateSalary(int id, double salary)throws EmployeeNotFoundException;
    String delete(int id)throws EmployeeNotFoundException;
    List<Employee> findAll();
}
