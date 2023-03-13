package com.practiceapp.employeems.dao;

import com.practiceapp.employeems.entity.Employee;

import java.util.List;
import java.util.Map;

public interface IEmployeeDao {
    void add(Employee employee);
    void update(Employee employee);
    Employee findById(int id);
    Map<Integer,Employee> findAll();

}
