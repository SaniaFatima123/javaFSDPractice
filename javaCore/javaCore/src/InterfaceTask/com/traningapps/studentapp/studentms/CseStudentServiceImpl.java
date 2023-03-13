package InterfaceTask.com.traningapps.studentapp.studentms;

public class CseStudentServiceImpl extends AbstractStudentService  implements ICseStudentService{

    public  CseStudentServiceImpl(int capacity){
        super(capacity);
    }

    public CseStudent addStudent(CseStudent cseStudent){
       Student student  = super.addStudent(cseStudent);
       return (CseStudent) student;
    }
    public CseStudent findById(long id){
        Student student = super.findStudentById(id);
        return (CseStudent) student;
    }

    public CseStudent[] findAll(){
        CseStudent[] cseStudents = new CseStudent[5];
        int index = 0;
        Student[] students = super.findAll();
        for(Student student: students){
            if(index< cseStudents.length && student!=null){
                cseStudents[index] = (CseStudent) student;
                index++;
            }
        }
        return cseStudents;
    }


}
