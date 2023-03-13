package InterfaceTask.com.traningapps.studentapp.ui;


import InterfaceTask.com.traningapps.studentapp.departmentms.Department;
import InterfaceTask.com.traningapps.studentapp.studentms.*;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        ICseStudentService cseStudentService = new CseStudentServiceImpl(20);

        CseStudent cseStudent1 = new CseStudent(1, "Sheela", new Department("AC52", "CSE"), "C++",
                2);
        CseStudent cseStudent2 = new CseStudent(2, "Sara", new Department("AG58", "ISE"), "C#",
                1);
        CseStudent cseStudent3 = new CseStudent(3, "Sara", new Department("AY52", "CSE"), "Java",
                3);
        CseStudent cseStudent = cseStudentService.addStudent(cseStudent1);
        System.out.println(cseStudent+ " Added ");
        cseStudentService.addStudent(cseStudent2);
        cseStudentService.addStudent(cseStudent3);

        // finding  by id
        long id = 1;
        System.out.println("Finding by id **************************************************");
        CseStudent foundCseStudentById = cseStudentService.findById(id);
        obj.display(foundCseStudentById);
        System.out.println("***************************************************");

        //finding All CSE Students
        System.out.println("Finding all CSE Students ***************************************");
        CseStudent[] foundAllCseStudents =cseStudentService.findAll();
        obj.display(foundAllCseStudents);
        System.out.println("****************************************************");


        IEceStudentService eceStudentService = new EceStudentServiceImpl(20);

        EceStudent eceStudent1 = new EceStudent(1, "ABCD", new Department("AC52", "ECE"), "Transistor",
                2);
        EceStudent eceStudent2 = new EceStudent(2, "EFGH", new Department("AG58", "ECE"), "Flana Dhimkana",
                1);
        EceStudent eceStudent3 = new EceStudent(3, "IJKL", new Department("AY52", "EEE"), "XYZ",
                3);
        EceStudent eceStudent = eceStudentService.addStudent(eceStudent1);
        System.out.println(eceStudent+ " Added ");
        eceStudentService.addStudent(eceStudent2);
        eceStudentService.addStudent(eceStudent3);

        // finding  by id
        long id2 = 1;
        System.out.println("Finding by id **************************************************");
        EceStudent foundEceStudentById = eceStudentService.findById(id2);
        obj.display(foundEceStudentById);
        System.out.println("***************************************************");

        //finding All ECE Students
        System.out.println("Finding all ECE Students ***************************************");
        EceStudent[] foundAllEceStudents =eceStudentService.findAll();
        obj.display(foundAllEceStudents);
        System.out.println("****************************************************");
    }
    public void display(CseStudent[] cseStudents){
        for(CseStudent cseStudent:cseStudents){
           display(cseStudent);
        }
    }
    public void display(CseStudent cseStudent){
        if(cseStudent!=null){
            System.out.println("Id is "+cseStudent.getId()+" Name is "+cseStudent.getName()+" Department name is "
                    +cseStudent.getDepartment().getName());
        }
    }


    public void display(EceStudent[] eceStudents){
        for(EceStudent eceStudent:eceStudents){
            display(eceStudent);
        }
    }
    public void display(EceStudent eceStudent){
        if(eceStudent!=null){
            System.out.println("Id is "+eceStudent.getId()+" Name is "+eceStudent.getName()+" Department name is "
                    +eceStudent.getDepartment().getName());
        }
    }

}
