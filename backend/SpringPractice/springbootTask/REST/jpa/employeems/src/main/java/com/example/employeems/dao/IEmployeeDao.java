package com.example.employeems.dao;

import com.example.employeems.entity.Employee;

import java.util.List;

public interface IEmployeeDao {
    Employee save(Employee employee);
    Employee findById(int id);
    List<Employee> findByName(String name);
    void delete(Employee employee);
    List<Employee> findAll();
}
