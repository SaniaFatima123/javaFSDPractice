package InterfaceEnumTask.com.traningapps.employeeapp.employeems;

public interface ICAEmployee{
    CAEmployee addEmployee(CAEmployee caEmployee);
    CAEmployee findById(long id);
    CAEmployee[] findByLocation(Location location);
    String updateSalary(long id, double salary);
    void deleteEmployee(long id);
    CAEmployee[] findAll();
}
