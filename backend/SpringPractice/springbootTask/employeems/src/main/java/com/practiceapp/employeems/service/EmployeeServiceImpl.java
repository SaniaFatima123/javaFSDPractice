package com.practiceapp.employeems.service;

import com.practiceapp.employeems.dao.EmployeeDaoImpl;
import com.practiceapp.employeems.entity.Employee;
import com.practiceapp.employeems.exception.EmployeeNotFoundException;
import com.practiceapp.employeems.exception.InvalidNameException;
import com.practiceapp.employeems.exception.InvalidSalaryException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Map;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    EmployeeDaoImpl employeeDao;

    @Override
    public Employee addEmp(String name, int salary) {
        validateName(name);
        validateSalary(salary);
        Employee employee = new Employee(name, salary);
        employeeDao.add(employee);
        return employee;
    }

    @Override
    public Employee updateSalary(int id, int salary) throws EmployeeNotFoundException {
        validateSalary(salary);
        Employee employee = findById(id);
        employee.setSalary(salary);
        employeeDao.update(employee);
        return employee;
    }

    @Override
    public Employee findById(int id) throws EmployeeNotFoundException {
        Employee foundEmployee = employeeDao.findById(id);
        if (foundEmployee == null) {
            throw new EmployeeNotFoundException("Employee not found");
        }
        return foundEmployee;
    }

    @Override
    public Map<Integer, Employee> findAllEmployee() {

        Map<Integer, Employee> found = employeeDao.findAll();
        return found;
    }

    private void validateSalary(int salary) {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary is invalid");
        }
    }

    private void validateName(String name) {
        if (name.isEmpty() || name.isBlank() || name.length() < 3) {
            throw new InvalidNameException("Name is invalid");
        }
    }
}
