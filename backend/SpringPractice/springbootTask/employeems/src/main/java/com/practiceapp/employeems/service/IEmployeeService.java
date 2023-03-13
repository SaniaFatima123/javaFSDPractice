package com.practiceapp.employeems.service;

import com.practiceapp.employeems.entity.Employee;
import com.practiceapp.employeems.exception.EmployeeNotFoundException;

import java.util.List;
import java.util.Map;

public interface IEmployeeService {
    Employee addEmp(String name, int salary);
    Employee updateSalary(int id, int salary)throws EmployeeNotFoundException;
    Employee findById(int id)throws EmployeeNotFoundException;

    Map<Integer,Employee> findAllEmployee();
}
