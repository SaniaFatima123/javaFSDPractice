package InterfaceEnumTask.com.traningapps.employeeapp.ui;

import InterfaceEnumTask.com.traningapps.employeeapp.departmentms.Department;
import InterfaceEnumTask.com.traningapps.employeeapp.employeems.*;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        //For ITEmployee
        IITEmployee itEmployeeImpl = new ITEmployeeImpl(20);
        ITEmployee itEmployee1 = new ITEmployee(1, "Farhan", 22, new Department("AS54", "Analyst"), "India",
                Location.BANGALORE, 45000, "Java FSD", 2);
        ITEmployee itEmployee2 = new ITEmployee(2, "Rohit", 23, new Department("AS86", "Software Engineer"),
                "India", Location.PUNE, 50000, "Machine Learning", 1);
        ITEmployee itEmployee3 = new ITEmployee(3, "Rahul", 24, new Department("AS63", "Backend Developer"), "India",
                Location.BANGALORE, 55000, "Spring, Spring Boot", 2);


        ITEmployee itEmployee = itEmployeeImpl.addEmployee(itEmployee1);
        System.out.println(itEmployee + " has been added.");
        itEmployeeImpl.addEmployee(itEmployee2);
        itEmployeeImpl.addEmployee(itEmployee3);

        System.out.println("Finding all employee *****************************************");
        ITEmployee[] itEmployees = itEmployeeImpl.findAll();
        obj.display(itEmployees);
        System.out.println("***********************************************************");

        System.out.println("Finding by id *********************************************");
        ITEmployee foundByID = itEmployeeImpl.findById(2);
        obj.display(foundByID);
        System.out.println("********************************************");

        System.out.println("Finding by Location *************************************");
        ITEmployee[] foundEmployeesByLocation = itEmployeeImpl.findByLocation(Location.BANGALORE);
        obj.display(foundEmployeesByLocation);
        System.out.println("********************************************");

        System.out.println("Updating *************************************");
        String msg = itEmployeeImpl.updateSalary(2, 80000);
        System.out.println(msg);
        System.out.println("Finding all employee After Updating *****************************************");
        ITEmployee[] itEmployeesUpdating = itEmployeeImpl.findAll();
        obj.display(itEmployeesUpdating);
        System.out.println("***********************************************************");

        System.out.println("Deleting *************************************");
        itEmployeeImpl.deleteEmployee(1);
        System.out.println("Finding all employee After Deleting *****************************************");
        ITEmployee[] itEmployeesDeleting = itEmployeeImpl.findAll();
        obj.display(itEmployeesDeleting);
        System.out.println("************************************************");

        //For ElectronicsEmployee
        IElectronicsEmployee electronicsEmployeeImpl = new ElectronicsEmployeeImpl(5);
        ElectronicsEmployee electronicsEmployee1 = new ElectronicsEmployee(1, "Ali", 22,
                new Department("RG56", "Operator"), "India", Location.BANGALORE, 35000, "Transistor", 2);
        ElectronicsEmployee electronicsEmployee2 = new ElectronicsEmployee(2, "chiku", 23, new Department("PO56", "Electrical Engineer"),
                "India", Location.PUNE, 50000, "Resistor", 1);
        ElectronicsEmployee electronicsEmployee3 = new ElectronicsEmployee(3, "Rahul", 24, new Department("AS88", "Assemble"), "India",
                Location.BANGALORE, 25000, "BJT", 1);


        ElectronicsEmployee electronicsEmployee = electronicsEmployeeImpl.addEmployee(electronicsEmployee1);
        System.out.println(electronicsEmployee + " has been added.");
        electronicsEmployeeImpl.addEmployee(electronicsEmployee2);
        electronicsEmployeeImpl.addEmployee(electronicsEmployee3);

        System.out.println("Finding all employee *****************************************");
        ElectronicsEmployee[] electronicsEmployees = electronicsEmployeeImpl.findAll();
        obj.display(electronicsEmployees);
        System.out.println("***********************************************************");

        System.out.println("Finding by id *********************************************");
        ElectronicsEmployee foundByID2 = electronicsEmployeeImpl.findById(2);
        obj.display(foundByID2);
        System.out.println("********************************************");

        System.out.println("Finding by Location *************************************");
        ElectronicsEmployee[] foundElectronicsEmployeesByLocation = electronicsEmployeeImpl.findByLocation(Location.BANGALORE);
        obj.display(foundElectronicsEmployeesByLocation);
        System.out.println("********************************************");

        System.out.println("Updating *************************************");
        String msg2 = electronicsEmployeeImpl.updateSalary(2, 80000);
        System.out.println(msg2);
        System.out.println("Finding all employee After Updating *****************************************");
        ElectronicsEmployee[] electronicsEmployeesUpdating = electronicsEmployeeImpl.findAll();
        obj.display(electronicsEmployeesUpdating);
        System.out.println("***********************************************************");

        System.out.println("Deleting *************************************");
        electronicsEmployeeImpl.deleteEmployee(1);
        System.out.println("Finding all employee After Deleting *****************************************");
        ElectronicsEmployee[] electronicsEmployeeDeleting = electronicsEmployeeImpl.findAll();
        obj.display(electronicsEmployeeDeleting);
        System.out.println("************************************************");

        //For CAEmployee
        ICAEmployee caEmployeeImpl = new CAEmployeeImpl(5);
        CAEmployee caEmployee1 = new CAEmployee(1, "Zoya", 21,
                new Department("PO56", "Banking"), "India", Location.BANGALORE, 32000, "Tally Sheet", 1);
        CAEmployee caEmployee2 = new CAEmployee(2, "Sameer", 23, new Department("FR56", "Management"),
                "India", Location.PUNE, 40000, "Managing", 2);
        CAEmployee caEmployee3 = new CAEmployee(3, "Rohan", 24, new Department("PO58", "Transaction"), "India",
                Location.BANGALORE, 45000, " Bank transaction", 3);


        CAEmployee caEmployee = caEmployeeImpl.addEmployee(caEmployee1);
        System.out.println(caEmployee + " has been added.");
        caEmployeeImpl.addEmployee(caEmployee2);
        caEmployeeImpl.addEmployee(caEmployee3);

        System.out.println("Finding all employee *****************************************");
        CAEmployee[] caEmployees = caEmployeeImpl.findAll();
        obj.display(caEmployees);
        System.out.println("***********************************************************");

        System.out.println("Finding by id *********************************************");
        CAEmployee foundByID3 = caEmployeeImpl.findById(2);
        obj.display(foundByID3);
        System.out.println("********************************************");

        System.out.println("Finding by Location *************************************");
        CAEmployee[] foundCAEmployeesByLocation = caEmployeeImpl.findByLocation(Location.BANGALORE);
        obj.display(foundCAEmployeesByLocation);
        System.out.println("********************************************");

        System.out.println("Updating *************************************");
        String msg3 = caEmployeeImpl.updateSalary(2, 80000);
        System.out.println(msg2);
        System.out.println("Finding all employee After Updating *****************************************");
        CAEmployee[] caEmployeesUpdating = caEmployeeImpl.findAll();
        obj.display(caEmployeesUpdating);
        System.out.println("***********************************************************");

        System.out.println("Deleting *************************************");
        caEmployeeImpl.deleteEmployee(1);
        System.out.println("Finding all employee After Deleting *****************************************");
        CAEmployee[] caEmployeeDeleting = caEmployeeImpl.findAll();
        obj.display(caEmployeeDeleting);
        System.out.println("************************************************");


    }

    //Display method for ITEmployee
    public void display(ITEmployee[] itEmployees) {
        for (ITEmployee itEmployee : itEmployees) {
            display(itEmployee);
        }
    }

    public void display(ITEmployee itEmployee) {
        if (itEmployee != null) {
            System.out.println("Employee Id is " + itEmployee.getId() + " name is " + itEmployee.getName() +
                    " Department name is " + itEmployee.getDepartment().getName() +
                    " Salary is " + itEmployee.getSalary() + " language is " + itEmployee.getLanguageUsed()
                    + " location is " + itEmployee.getLocation());
        }

    }

    //Display method for ElectronicsEmployee
    public void display(ElectronicsEmployee[] electronicsEmployees) {
        for (ElectronicsEmployee electronicsEmployee : electronicsEmployees) {
            display(electronicsEmployee);
        }
    }

    public void display(ElectronicsEmployee electronicsEmployee) {
        if (electronicsEmployee != null) {
            System.out.println("Employee Id is " + electronicsEmployee.getId() + " name is " + electronicsEmployee.getName() +
                    " Department name is " + electronicsEmployee.getDepartment().getName() +
                    " Salary is " + electronicsEmployee.getSalary() + " Device used is " + electronicsEmployee.getDeviceUsed()
                    + " location is " + electronicsEmployee.getLocation());
        }
    }

        //Display method for CAEmployee

        public void display (CAEmployee[]caEmployees){
            for (CAEmployee caEmployee : caEmployees) {
                display(caEmployee);
            }
        }

        public void display (CAEmployee caEmployee){
            if (caEmployee != null) {
                System.out.println("Employee Id is " + caEmployee.getId() + " name is " + caEmployee.getName() +
                        " Department name is " + caEmployee.getDepartment().getName() +
                        " Salary is " + caEmployee.getSalary() + " Device used is " + caEmployee.getSkill()
                        + " location is " + caEmployee.getLocation());
            }

        }

    }
