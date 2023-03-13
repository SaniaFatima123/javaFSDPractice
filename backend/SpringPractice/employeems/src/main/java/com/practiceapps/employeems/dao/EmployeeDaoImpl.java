package com.practiceapps.employeems.dao;

import com.practiceapps.employeems.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.*;
@Component
public class EmployeeDaoImpl implements IEmployeeDao {
    private Map<Long, Employee> employees = new HashMap<>();
    private long generatedId;

    private long generateId() {
        return ++generatedId;
    }


    @Override
    public void add(Employee employee) {
        long id = generateId();
        employee.setId(id);
        employees.put(id, employee);
    }

    @Override
    public Employee findById(long id) {
        Set<Long> keys = employees.keySet();
        for (Long key : keys) {
            Employee employee = employees.get(key);
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public List<Employee> findByName(String name) {
        List<Employee> employeeList = new ArrayList<>();
        Set<Long> keys = employees.keySet();
        for (Long key : keys) {
            Employee employee = employees.get(key);
            if (employee != null && employee.getName().equalsIgnoreCase(name)) {
                employeeList.add(employee);
            }
        }
        return employeeList;
    }

    @Override
    public void update(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public List<Employee> findAll() {
        List<Employee> allEmployees = new ArrayList<>();
        Collection<Employee> values = employees.values();
        allEmployees.addAll(values);
        return allEmployees;
    }

    public void delete(Employee employee) {
        employees.remove(employee.getId());
    }


}
