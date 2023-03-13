package InterfaceEnumTask.com.traningapps.employeeapp.employeems;

public interface IElectronicsEmployee {
    ElectronicsEmployee addEmployee(ElectronicsEmployee electronicsEmployee);
    ElectronicsEmployee findById(long id);
    ElectronicsEmployee[] findByLocation(Location location);
    String updateSalary(long id, double salary);
    void deleteEmployee(long id);
    ElectronicsEmployee[] findAll();
}
