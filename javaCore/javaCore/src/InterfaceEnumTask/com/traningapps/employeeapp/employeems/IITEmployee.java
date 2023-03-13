package InterfaceEnumTask.com.traningapps.employeeapp.employeems;

public interface IITEmployee{
    ITEmployee addEmployee(ITEmployee itEmployee);
    ITEmployee findById(long id);
    ITEmployee[] findByLocation(Location location);
    String updateSalary(long id, double salary);
    void deleteEmployee(long id);
    ITEmployee[] findAll();
}
