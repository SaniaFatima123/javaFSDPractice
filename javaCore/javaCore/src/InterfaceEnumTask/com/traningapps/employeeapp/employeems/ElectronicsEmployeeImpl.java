package InterfaceEnumTask.com.traningapps.employeeapp.employeems;

public class ElectronicsEmployeeImpl extends EmployeeStore implements IElectronicsEmployee{
    public ElectronicsEmployeeImpl(int capacity){
        super(capacity);
    }
    @Override
    public ElectronicsEmployee addEmployee(ElectronicsEmployee electronicsEmployee){
        Employee employee =  super.addEmployee(electronicsEmployee);
        return (ElectronicsEmployee) employee;
    }
    @Override
    public ElectronicsEmployee findById(long id){
        Employee employee =  super.findById(id);
        return (ElectronicsEmployee) employee;
    }
    @Override
    public ElectronicsEmployee[] findByLocation(Location location){
        ElectronicsEmployee[] foundByLocation = new ElectronicsEmployee[10];
        int index = 0;
        Employee[] employees = super.findByLocation(location);
        for(Employee employee:employees){
            if(employee!=null){
                foundByLocation[index]  =  (ElectronicsEmployee) employee;
                index++;
            }
        }
        return foundByLocation;
    }
    @Override
    public String updateSalary(long id, double salary){
        String msg = super.updateEmployee(id, salary);
        return msg;
    }
    @Override
    public void deleteEmployee(long id){
        super.delete(id);
    }
    @Override
    public ElectronicsEmployee[] findAll(){
        ElectronicsEmployee[] foundByLocation = new ElectronicsEmployee[10];
        int index = 0;
        Employee[] employees = super.findAll();
        for(Employee employee:employees){
            if(employee!=null){
                foundByLocation[index]  =  (ElectronicsEmployee) employee;
                index++;
            }
        }
        return foundByLocation;
    }
}
