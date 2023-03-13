package com.practiceapps.employeems.service;

import com.practiceapps.employeems.comparatorName.SortByName;
import com.practiceapps.employeems.dao.EmployeeDaoImpl;
import com.practiceapps.employeems.dao.IEmployeeDao;
import com.practiceapps.employeems.entity.Employee;
import com.practiceapps.employeems.exceptions.EmployeeNotFoundException;
import com.practiceapps.employeems.exceptions.InvalidAgeException;
import com.practiceapps.employeems.exceptions.InvalidIdException;
import com.practiceapps.employeems.exceptions.InvalidNameException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
@Component
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    IEmployeeDao employeeDao;

    @Override
    public Employee register(String name, int age) {
        validateName(name);
        validateAge(age);
        Employee employee = new Employee(name,age);
        employeeDao.add(employee);
        return employee;
    }

    @Override
    public Employee findEmployeeById(long id) throws EmployeeNotFoundException {
        validateId(id);
        Employee employee = employeeDao.findById(id);
        if(employee==null){
            throw new EmployeeNotFoundException("Employee is not found");
        }
        return employee;
    }

    @Override
    public Employee changeName(long id, String newName) throws EmployeeNotFoundException {
        validateId(id);
        validateName(newName);
        Employee employee = findEmployeeById(id);
        employee.setName(newName);
        employeeDao.update(employee);
        return employee;
    }

    @Override
    public String deleteEmployee(long id) throws EmployeeNotFoundException{
        Employee employee = findEmployeeById(id);
        employeeDao.delete(employee);
        return "Employee is deleted with ID "+id;
    }

    @Override
    public List<Employee> findByName(String name) {
        return employeeDao.findByName(name);
    }

    @Override
    public List<Employee> sortByName(List<Employee> employees) {
        SortByName sortByName = new SortByName();
        Collections.sort(employees,sortByName);
        return employees;

    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    private void validateId(long id) {
        if (id <= 0) {
            throw new InvalidIdException("Id is Invalid");
        }
    }

    private void validateAge(int age) {
        if (age < 18 || age > 60) {
            throw new InvalidAgeException("Age is Invalid");
        }
    }

    private void validateName(String name) {
        if (name.length() < 2 || name.length() > 10) {
            throw new InvalidNameException("Name is Invalid");
        }
    }

}
