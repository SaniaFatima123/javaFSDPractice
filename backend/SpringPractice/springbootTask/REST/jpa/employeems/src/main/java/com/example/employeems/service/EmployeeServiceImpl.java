package com.example.employeems.service;

import com.example.employeems.dao.IEmployeeDao;
import com.example.employeems.entity.Employee;
import com.example.employeems.exception.EmployeeNotFoundException;
import com.example.employeems.exception.InvalidNameException;
import com.example.employeems.exception.InvalidSalaryException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService{
    @Autowired
    IEmployeeDao employeeDao;
    @Override
    public Employee add(String name, double salary) {
        validateName(name);
        validateSalary(salary);
        Employee employee = new Employee(name,salary);
        Employee added = employeeDao.save(employee);
        return added;
    }

    @Override
    public Employee findById(int id)throws EmployeeNotFoundException {
        Employee employee = employeeDao.findById(id);
        if(employee == null){
            throw new EmployeeNotFoundException("employee not found for id "+id);
        }
        return employee;
    }

    @Override
    public List<Employee> findByName(String name) {
        List<Employee> foundEmp = employeeDao.findByName(name);
        return foundEmp;

    }

    @Override
    public Employee updateSalary(int id, double salary) throws EmployeeNotFoundException{
       Employee employee = findById(id);
       employee.setSalary(salary);
       Employee updatedEmp = employeeDao.save(employee);
       return updatedEmp;
    }

    @Override
    public String delete(int id)throws EmployeeNotFoundException {
        Employee employee = findById(id);
        employeeDao.delete(employee);
        return "employee with id "+id+" has been deleted";
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }
    private void validateName(String name){
        if(name.length()<2){
            throw new InvalidNameException("name is invalid");
        }
    }
    private void validateSalary(double salary){
        if(salary<=0){
            throw new InvalidSalaryException("salary is invalid");
        }
    }
}
