package InterfaceTask.com.traningapps.studentapp.studentms;

public class AbstractStudentService {
    Student[] students;
    public  AbstractStudentService(int capacity){
        students = new Student[capacity];
    }
    private int index = 0;
    public Student addStudent(Student student){
        if(index<students.length){
            students[index] = student;
            index++;
           return student;
        }
        return  null;

    }
    public Student findStudentById(long id){
        for(Student student:students){
            if(student!=null && student.getId()==id){
                return student;
            }
        }
        return null;
    }
    public Student[] findStudentsByName(String name){
        Student[] foundStudents = new Student[5];
        int index = 0;
        for(Student student:students){
            if(index<foundStudents.length && student!=null && student.getName().equalsIgnoreCase(name)){
                foundStudents[index]=student;
                index++;
            }
        }
        return foundStudents;
    }
    public Student[] findAll(){
        return students;
    }
}
