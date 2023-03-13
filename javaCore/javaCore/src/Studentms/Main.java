package Studentms;

public class Main {
    public static void main(String[] args) {
        StudentStore studentStore = new StudentStore(5);
        Student student1 = new Student(1,"sameer",20,new Address("Bhopal","752001","MP","India"),"Male","Mingle");
        Address address2 = new Address("kolkata","700052","WB","India");
        Student student2 = new Student(2,"Priyanka",21, address2,"Female","Single");
        Student student3 = new Student(3,"Rahul",22,new Address("srinagar","123456","JK","India"),"Male","Mingle");
        Student student4 = new Student(4,"Rahul",23,new Address("Siwan","123489","Bihar","India"),"Male","Mingle");
        studentStore.addStudent(student1);
        studentStore.addStudent(student2);
        studentStore.addStudent(student3);
        studentStore.addStudent(student4);

        System.out.println("find by id *********");
        Student foundStudent = studentStore.findById(1);
        if(foundStudent!=null) {
            System.out.println(" id is "+foundStudent.getId()+ ", Name is "+foundStudent.getName()+", Age is "+foundStudent.getAge()+
                    ", Address is "+foundStudent.getAddress().getCity()+".");
        }

        System.out.println("find by name ********");
        Student[] foundStudentsByName = studentStore.findByName("Rahul");
        for(Student student: foundStudentsByName){
            if(student!=null){
                System.out.println(" id is "+student.getId()+ ", Name is "+student.getName()+", Age is "+student.getAge()+
                        ", Address is "+student.getAddress().getCity()+".");
            }
        }
        System.out.println("find all *********");
        Student[] foundAll = studentStore.findAll();
        for(Student student: foundAll){
            if(student!=null){
                System.out.println(" id is "+student.getId()+ ", Name is "+student.getName()+", Age is "+student.getAge()+
                        ", Address is "+student.getAddress().getCity()+".");
            }
        }
        System.out.println("Updated City ********");
        String updatedCity = studentStore.updateStudentCity(2,"Chennai");
        System.out.println(updatedCity);
        Student[] foundAllAfterUpdating = studentStore.findAll();
        for(Student student: foundAllAfterUpdating){
            if(student!=null){
                System.out.println(" id is "+student.getId()+ ", Name is "+student.getName()+", Age is "+student.getAge()+
                        ", Address is "+student.getAddress().getCity()+".");
            }
        }

    }
}
