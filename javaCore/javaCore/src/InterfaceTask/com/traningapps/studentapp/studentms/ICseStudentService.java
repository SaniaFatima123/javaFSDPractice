package InterfaceTask.com.traningapps.studentapp.studentms;

public interface ICseStudentService extends IStudentService{

    CseStudent addStudent(CseStudent cseStudent);
    CseStudent findById(long id);
    CseStudent[] findAll();

}
