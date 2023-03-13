package com.practiceapp.employeems.frontend;

import com.practiceapp.employeems.dao.EmployeeDaoImpl;
import com.practiceapp.employeems.dao.IEmployeeDao;
import com.practiceapp.employeems.entity.Employee;
import com.practiceapp.employeems.exception.EmployeeNotFoundException;
import com.practiceapp.employeems.service.EmployeeServiceImpl;
import com.practiceapp.employeems.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Frontend {
    @Autowired
    IEmployeeService employeeService;
    public void runUi() {
        try {

            Employee emp1 = employeeService.addEmp("Hebah", 30000);
            Employee emp2 = employeeService.addEmp("Saurav", 35000);
            Employee emp3 = employeeService.addEmp("XYZ", 40000);
            System.out.println(emp1 + " Added");

            System.out.println("Finding All **************************");
            Map<Integer,Employee> listOfEmployees1 = employeeService.findAllEmployee();
            System.out.println(listOfEmployees1);

            System.out.println("*****************************************");
            System.out.println("Updating Salary **************************");
            Employee updatedEmployee = employeeService.updateSalary(2, 36000);
            System.out.println(updatedEmployee);
            System.out.println("*****************************************");
            System.out.println("Finding by id **************************");
            Employee foundById = employeeService.findById(3);
            System.out.println(foundById);
            System.out.println("*****************************************");
            System.out.println("Finding All **************************");

            Map<Integer,Employee> listOfEmployees = employeeService.findAllEmployee();
            System.out.println(listOfEmployees);
        }
        catch(EmployeeNotFoundException e){
            System.out.println(e.getMessage());

        }
    }
}
