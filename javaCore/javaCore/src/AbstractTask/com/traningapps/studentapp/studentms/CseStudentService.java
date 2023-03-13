package AbstractTask.com.traningapps.studentapp.studentms;

public class CseStudentService extends BaseStudentService {
    public CseStudentService(int capacity) {
        super(capacity);
    }

    public void addStudent(Student student) {
        super.addStudent(student);
    }

    public CseStudent findStudentById(long id) {
        Student student = super.findStudentById(id);
        return (CseStudent) student;
    }

    public CseStudent[] findStudentsByName(String name) {
        Student[] students = super.findStudentsByName(name);
        CseStudent[] cseStudents = new CseStudent[5];
        int index = 0;
        for (Student student : students) {
            if (index < cseStudents.length && student != null) {
                cseStudents[index] = (CseStudent) student;
                index++;
            }
        }
        return cseStudents;
    }

    public CseStudent[] findAll() {
        CseStudent[] cseStudents = new CseStudent[5];
        int index = 0;
        Student[] students = super.findAll();
        for (Student student : students) {
            if (index < cseStudents.length && student != null) {
                cseStudents[index] = (CseStudent) student;
                index++;
            }
        }
        return cseStudents;
    }
}
