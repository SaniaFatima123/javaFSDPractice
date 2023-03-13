package AbstractTask.com.traningapps.studentapp.studentms;

public class EceStudentService extends BaseStudentService {
    public EceStudentService(int capacity) {
        super(capacity);
    }
    @Override
    public void addStudent(Student student){

        super.addStudent(student);
    }
   @Override
    public EceStudent findStudentById(long id){
        Student student = super.findStudentById(id);
        return (EceStudent) student;
    }
    @Override
    public EceStudent[] findStudentsByName(String name){
        EceStudent[] eceStudents = new EceStudent[5];
        int index = 0;
        Student[] students = super.findStudentsByName(name);
        for(Student student:students){
            if(index<eceStudents.length && student!=null){
                eceStudents[index] = (EceStudent) student;
                index++;
            }
        }
        return eceStudents;
    }
    public EceStudent[] findAll(){
        EceStudent[] eceStudents = new EceStudent[5];
        int index = 0;
        Student[] students = super.findAll();
        for(Student student:students){
            if(index<eceStudents.length && student!=null){
                eceStudents[index] = (EceStudent) student;
                index++;
            }
        }
        return eceStudents;
    }
}
