package com.practiceapps.employeems.dao;

import com.practiceapps.employeems.entity.Employee;

import java.util.List;

public interface IEmployeeDao {
    void add(Employee employee);
    Employee findById(long id);
    void update(Employee employee);

    void delete(Employee employee);

    List<Employee> findByName(String name);
    List<Employee> findAll();

}
