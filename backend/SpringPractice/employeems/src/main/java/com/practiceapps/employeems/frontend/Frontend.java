package com.practiceapps.employeems.frontend;

import com.practiceapps.employeems.entity.Employee;
import com.practiceapps.employeems.exceptions.EmployeeNotFoundException;
import com.practiceapps.employeems.exceptions.InvalidAgeException;
import com.practiceapps.employeems.exceptions.InvalidIdException;
import com.practiceapps.employeems.exceptions.InvalidNameException;
import com.practiceapps.employeems.service.EmployeeServiceImpl;
import com.practiceapps.employeems.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
@Component
public class Frontend {
    @Autowired
    IEmployeeService employeeService;
    public void runUI() {
        employeeService.register("sohan", 22);
        employeeService.register("anam", 23);
        employeeService.register("maira", 25);
        employeeService.register("rahul", 24);
        System.out.println("Getting all employees*************");
        List<Employee> allEmployees = employeeService.findAll();
        display(allEmployees);

        try {
            Employee employee = employeeService.findEmployeeById(2);
            System.out.println(employee);
            System.out.println("*******************************");
            System.out.println("Changing name ******************");
            Employee employee1 = employeeService.changeName(3, "raina");
            System.out.println(employee1);
            System.out.println("*******************************");
            System.out.println("Deleting employee **************");
            String msg = employeeService.deleteEmployee(4);
            System.out.println(msg);
            System.out.println("Getting all employees after deleting***");
            List<Employee> allEmployeesList = employeeService.findAll();
            display(allEmployeesList);
            System.out.println("*******************************");
            System.out.println("Finding employee by name ********");
            String name ="sohan";
            List<Employee> foundEmployeeByName = employeeService.findByName(name);
            display(foundEmployeeByName);
            System.out.println("*******************************");
            System.out.println("Sorting employee by name ********");
            List<Employee> sortedEmployee = employeeService.sortByName(allEmployeesList);
            display(sortedEmployee);
        }
        catch (InvalidNameException e){
            System.out.println(e.getMessage());
        }
        catch(InvalidIdException e){
            System.out.println(e.getMessage());
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public void display(Collection<Employee> employees){
        for(Employee employee: employees){
            if(employee!=null){
                System.out.println("Employee ID is "+employee.getId()+" Employee name is "+employee.getName()+" Employee age is "
                +employee.getAge());
            }
        }
    }
}
