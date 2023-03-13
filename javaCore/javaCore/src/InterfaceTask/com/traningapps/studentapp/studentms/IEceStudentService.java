package InterfaceTask.com.traningapps.studentapp.studentms;

import InterfaceTask.com.traningapps.studentapp.studentms.EceStudent;

public interface IEceStudentService extends IStudentService{

    EceStudent addStudent(EceStudent eceStudent);
    EceStudent findById(long id);
    EceStudent[] findAll();
}
