package InheritancePractice.com.traningapps.employeeapp.ui;

import InheritancePractice.com.traningapps.employeeapp.departmentms.Department;
import InheritancePractice.com.traningapps.employeeapp.employeems.Employee;
import InheritancePractice.com.traningapps.employeeapp.employeems.EmployeeStorage;
import InheritancePractice.com.traningapps.employeeapp.employeems.NonTechnicalEmployee;
import InheritancePractice.com.traningapps.employeeapp.employeems.TechnicalEmployee;

public class Main {
    public static void main(String[] args) {
        EmployeeStorage employeeStorage = new EmployeeStorage(10);
        employeeStorage.addTechnicalEmployee(1, "kulsum", 22, "India", 44000, new Department("12AS",
                "Software", 50), "C++", 2);
        employeeStorage.addTechnicalEmployee(2, "Riya", 23, "India", 45000, new Department("12gf",
                "Analyst", 65), "Java", 3);
        employeeStorage.addTechnicalEmployee(3, "sofia", 24, "India", 46000, new Department("12gh",
                "Production", 60), "C#", 3);


        Department department1 = new Department("15khh", "Production", 100);
        NonTechnicalEmployee nonTechnicalEmployee1 = new NonTechnicalEmployee(4, "Sharukh", 54, "India", 60000
                , department1, "Economics", 20);
        Department department2 = new Department("15hny", "Management", 50);
        NonTechnicalEmployee nonTechnicalEmployee2 = new NonTechnicalEmployee(5, "Rahul", 26, "India", 50000
                , department2, "Project Management", 7);
        Department department3 = new Department("15ryjky", "HR", 23);
        NonTechnicalEmployee nonTechnicalEmployee3 = new NonTechnicalEmployee(6, "Salman bin Saudi", 56, "Saudi", 70000
                , department3, "Communication", 22);
        employeeStorage.addNonTechnicalEmployee(nonTechnicalEmployee1);
        employeeStorage.addNonTechnicalEmployee(nonTechnicalEmployee2);
        employeeStorage.addNonTechnicalEmployee(nonTechnicalEmployee3);

        System.out.println("Finding all Employee *********************************************************************************");
        Employee[] foundEmplyees = employeeStorage.findAll();
        for (Employee employee : foundEmplyees) {
            if (employee != null) {
                System.out.println("ID is " + employee.getId() + " Name is " + employee.getName() + " Salary is " + employee.getSalary() +
                        " Department is " + employee.getDepartment().getName());
                boolean isTech = employee instanceof TechnicalEmployee;
                if (isTech) {
                    TechnicalEmployee technicalEmployee = (TechnicalEmployee) employee;
                    System.out.println("Language used is " + technicalEmployee.getLanguage() + " Experience in years " + technicalEmployee.getCodingExperienceInYrs());
                } else {
                    NonTechnicalEmployee nonTechnicalEmployee = (NonTechnicalEmployee) employee;
                    System.out.println("Skills is " + nonTechnicalEmployee.getSkill() + " Experience with Skills in years " + nonTechnicalEmployee.getExperienceWithSkillInYrs());
                }

            }
        }
        System.out.println("********************************************************************************");
        long id = 3;
        System.out.println("Finding Employee By ID " + id + " ********************************************************");


        Employee foundById = employeeStorage.findEmployeeByeById(id);
        if (foundById != null) {
            System.out.println("ID is " + foundById.getId() + " Name is " + foundById.getName() + " Salary is " + foundById.getSalary() +
                    " Department is " + foundById.getDepartment().getName());
            boolean isTech = foundById instanceof TechnicalEmployee;
            if (isTech) {
                TechnicalEmployee technicalEmployee = (TechnicalEmployee) foundById;
                System.out.println("Language used is " + technicalEmployee.getLanguage() + " Experience in years " + technicalEmployee.getCodingExperienceInYrs());
            } else {
                NonTechnicalEmployee nonTechnicalEmployee = (NonTechnicalEmployee) foundById;
                System.out.println("Skills is " + nonTechnicalEmployee.getSkill() + " Experience with Skills in years " + nonTechnicalEmployee.getExperienceWithSkillInYrs());
            }

        }
        System.out.println("**********************************************************************************************");

        String departmentName = "Production";
        System.out.println("Finding Employee By Department Name " + departmentName + " ******************************************* ");

        Employee[] foundByName = employeeStorage.findEmployeeByDepartmentName(departmentName);
        for (Employee employee : foundByName) {
            if (employee != null) {
                System.out.println("ID is " + employee.getId() + " Name is " + employee.getName() + " Salary is " + employee.getSalary() +
                        " Department is " + employee.getDepartment().getName());
                boolean isTech = employee instanceof TechnicalEmployee;
                if (isTech) {
                    TechnicalEmployee technicalEmployee = (TechnicalEmployee) employee;
                    System.out.println("Language used is " + technicalEmployee.getLanguage() + " Experience in years " + technicalEmployee.getCodingExperienceInYrs());
                } else {
                    NonTechnicalEmployee nonTechnicalEmployee = (NonTechnicalEmployee) employee;
                    System.out.println("Skills is " + nonTechnicalEmployee.getSkill() + " Experience with Skills in years " + nonTechnicalEmployee.getExperienceWithSkillInYrs());
                }

            }
        }

    }
}
