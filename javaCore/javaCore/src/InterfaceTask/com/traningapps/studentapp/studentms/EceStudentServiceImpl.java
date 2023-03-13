package InterfaceTask.com.traningapps.studentapp.studentms;

public class EceStudentServiceImpl extends AbstractStudentService implements IEceStudentService {

    public EceStudentServiceImpl(int capacity) {
        super(capacity);
    }

    public EceStudent addStudent(EceStudent eceStudent) {
        Student student = super.addStudent(eceStudent);
        return (EceStudent) student;
    }

    public EceStudent findById(long id) {
        Student student = super.findStudentById(id);
        return (EceStudent) student;
    }

    public EceStudent[] findAll() {
        EceStudent[] eceStudents = new EceStudent[5];
        int index = 0;
        Student[] students = super.findAll();
        for (Student student : students) {
            if (index < eceStudents.length && student != null) {
                eceStudents[index] = (EceStudent) student;
                index++;
            }
        }
        return eceStudents;
    }
}
