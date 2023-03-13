package AbstractTask.com.traningapps.studentapp.ui;

import AbstractTask.com.traningapps.studentapp.departmentms.Department;
import AbstractTask.com.traningapps.studentapp.studentms.CseStudent;
import AbstractTask.com.traningapps.studentapp.studentms.CseStudentService;
import AbstractTask.com.traningapps.studentapp.studentms.EceStudent;
import AbstractTask.com.traningapps.studentapp.studentms.EceStudentService;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();

        //CSE Students *******************************************************
        CseStudentService cseStudentService = new CseStudentService(10);
        CseStudent cseStudent1 = new CseStudent(1, "Sheela", new Department("AC52", "CSE"), "C++",
                2);
        CseStudent cseStudent2 = new CseStudent(2, "Sara", new Department("AG58", "ISE"), "C#",
                1);
        CseStudent cseStudent3 = new CseStudent(3, "Sara", new Department("AY52", "CSE"), "Java",
                3);
        cseStudentService.addStudent(cseStudent1);
        cseStudentService.addStudent(cseStudent2);
        cseStudentService.addStudent(cseStudent3);

        // finding all CSE Student
        System.out.println("*******************************");
        CseStudent[] foundCseStudents = cseStudentService.findAll();
        obj.display(foundCseStudents);

        //finding CSE Student by ID
        long id = 2;
        System.out.println("Finding CSE Student by ID " + id);
        CseStudent foundCseStudentById = cseStudentService.findStudentById(id);
        obj.display(foundCseStudentById);

        //finding CSE Students by Name
        String name = "Sara";
        System.out.println("Finding CSE Students by Name " + name);
        CseStudent[] cseStudents = cseStudentService.findStudentsByName(name);
        obj.display(cseStudents);

        //ECE Students *********************************************

        EceStudentService eceStudentService = new EceStudentService(20);

        //Creating objects for ECE Students
        EceStudent eceStudent1 = new EceStudent(1, "Shanaya", new Department("Bg855", "ECE"), "Transistor",
                2);
        EceStudent eceStudent2 = new EceStudent(2, "Chiku", new Department("GD326", "EEE"), "PNP Transistor",
                3);
        EceStudent eceStudent3 = new EceStudent(1, "Rocky Bhai", new Department("DF652", "ECE"), "M16 Automatic",
                5);
        eceStudentService.addStudent(eceStudent1);
        eceStudentService.addStudent(eceStudent2);
        eceStudentService.addStudent(eceStudent3);

        // finding all ECE Student
        System.out.println("*******************************");
        EceStudent[] foundElectronicsStudents = eceStudentService.findAll();
        obj.display(foundElectronicsStudents);

        //finding ECE Student by ID
        long id2 = 1;
        System.out.println("Finding ECE Student by ID " + id2);
        EceStudent foundEceStudentById = eceStudentService.findStudentById(id2);
        obj.display(foundEceStudentById);

        //finding ECE Students by Name
        String name1 = "Rocky Bhai";
        System.out.println("Finding ECE Students by Name " + name1);
        EceStudent[] eceStudents = eceStudentService.findStudentsByName(name1);
        obj.display(eceStudents);
    }

    public void display(CseStudent cseStudent) {
        if (cseStudent != null) {
            System.out.println("id is " + cseStudent.getId() + " Name is " + cseStudent.getName() + " Departrment name is "
                    + cseStudent.getDepartment().getName() + " language is " + cseStudent.getLanguage());
        }
    }

    public void display(CseStudent[] cseStudents) {
        for (CseStudent cseStudent : cseStudents) {
            display(cseStudent);
        }
    }

    public void display(EceStudent eceStudent) {
        if (eceStudent != null) {
            System.out.println("id is " + eceStudent.getId() + " Name is " + eceStudent.getName() + " Departrment name is "
                    + eceStudent.getDepartment().getName() + " Device is " + eceStudent.getDeviceUsed());
        }
    }

    public void display(EceStudent[] eceStudents) {
        for (EceStudent eceStudent : eceStudents) {
            display(eceStudent);
        }
    }

}
