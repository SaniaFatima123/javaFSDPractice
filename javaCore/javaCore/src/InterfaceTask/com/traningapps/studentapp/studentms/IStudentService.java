package InterfaceTask.com.traningapps.studentapp.studentms;

public interface IStudentService {
    Student findById(long id);
    Student[] findAll();
}
