package Studentms;

public class StudentStore {
    Student[] students;
    public StudentStore(int capacity){
        students = new Student[capacity];
    }
    private int index = 0;
    public void addStudent(Student student){
        if(index<students.length) {
            students[index] = student;
            index++;
        }
    }

    public Student findById(int id){
        for(Student student:students){
            if(student!=null && student.getId()==id){
                return student;
            }
        }
        return null;
    }

    public Student[] findAll(){

        return students;
    }

    public Student[] findByName(String name){
        Student[] foundStudent = new Student[3];
        int index = 0;
        for(Student student: students){
            if(student!=null && student.getName().equalsIgnoreCase(name)){
                 foundStudent[index]=student;
                 index++;
            }
        }
        return foundStudent;
    }

    public String updateStudentCity(int id, String city){
      for(Student student: students){
          if(student!=null && student.getId()==id){
              student.getAddress().setCity(city);
              return "City Updated";
          }
      }
      return "Student doesn't exists with id "+id;
    }




}
