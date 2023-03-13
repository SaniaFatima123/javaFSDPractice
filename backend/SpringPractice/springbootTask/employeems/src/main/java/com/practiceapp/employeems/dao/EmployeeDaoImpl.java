package com.practiceapp.employeems.dao;

import com.practiceapp.employeems.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

    private Map<Integer, Employee> employeeMap = new HashMap<>();

    private int generatedId;

    private int generateId() {
        return ++generatedId;
    }


    @Override
    public void add(Employee employee) {
        int id = generateId();
        employee.setId(id);
        employeeMap.put(id, employee);
    }

    @Override
    public void update(Employee employee) {
        System.out.println("Update method is called");
        employeeMap.put(employee.getId(), employee);
    }

    @Override
    public Employee findById(int id) {
        Set<Integer> keys = employeeMap.keySet();
        for (Integer key : keys) {
            if (key == id) {
                return employeeMap.get(key);
            }
        }
        return null;
    }

    @Override
    public Map<Integer, Employee> findAll() {
        //List<Employee> listOfEmployees = new ArrayList<>();
        // listOfEmployees.add((Employee) employeeMap.values());
        //listOfEmployees.addAll(employeeMap.values());
        return employeeMap;
    }
}
