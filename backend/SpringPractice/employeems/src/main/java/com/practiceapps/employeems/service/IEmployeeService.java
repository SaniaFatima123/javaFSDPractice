package com.practiceapps.employeems.service;

import com.practiceapps.employeems.entity.Employee;
import com.practiceapps.employeems.exceptions.EmployeeNotFoundException;

import java.util.List;

public interface IEmployeeService {
    Employee register(String name, int age);

    Employee findEmployeeById(long id) throws EmployeeNotFoundException;

    Employee changeName(long id, String newName) throws EmployeeNotFoundException;

    String deleteEmployee(long id) throws EmployeeNotFoundException;

    List<Employee> findByName(String name);

    List<Employee> sortByName(List<Employee> employees);

    List<Employee> findAll();
}
