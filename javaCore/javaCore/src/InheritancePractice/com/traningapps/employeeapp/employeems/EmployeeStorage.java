package InheritancePractice.com.traningapps.employeeapp.employeems;

import InheritancePractice.com.traningapps.employeeapp.departmentms.Department;

public class EmployeeStorage {
    Employee[] employees;

    public EmployeeStorage(int capacity) {
        employees = new Employee[capacity];
    }

    private int index = 0;

    public void addTechnicalEmployee(long id, String name, int age, String country, double salary, Department department, String language, int codingExperienceInYrs) {
        TechnicalEmployee technicalEmployee = new TechnicalEmployee(id, name, age, country, salary, department, language, codingExperienceInYrs);
        if (index < employees.length) {
            employees[index] = technicalEmployee;
            index++;
        }

    }

    public void addNonTechnicalEmployee(NonTechnicalEmployee nonTechnicalEmployee) {
        if (index < employees.length) {
            employees[index] = nonTechnicalEmployee;
            index++;
        }
    }

    public Employee findEmployeeByeById(long id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;

    }
    public Employee[] findEmployeeByDepartmentName(String name){
        int index = 0;
        Employee foundEmployees[] = new Employee[5];
        for(Employee employee: employees){
            if(employee!=null && employee.getDepartment().getName().equalsIgnoreCase(name)){
                foundEmployees[index] = employee;
                index++;
            }
        }
        return foundEmployees;
    }

    public Employee[] findAll() {
        return employees;
    }
}