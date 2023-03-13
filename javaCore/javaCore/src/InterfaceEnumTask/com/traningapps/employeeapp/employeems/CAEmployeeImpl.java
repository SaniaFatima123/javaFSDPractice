package InterfaceEnumTask.com.traningapps.employeeapp.employeems;

public class CAEmployeeImpl extends EmployeeStore implements ICAEmployee {
    public CAEmployeeImpl(int capacity){
        super(capacity);
    }
    @Override
    public CAEmployee addEmployee(CAEmployee caEmployee){
        Employee employee =  super.addEmployee(caEmployee);
        return (CAEmployee) employee;
    }
    @Override
    public CAEmployee findById(long id){
        Employee employee =  super.findById(id);
        return (CAEmployee) employee;
    }
    @Override
    public CAEmployee[] findByLocation(Location location){
        CAEmployee[] foundByLocation = new CAEmployee[10];
        int index = 0;
        Employee[] employees = super.findByLocation(location);
        for(Employee employee:employees){
            if(employee!=null){
                foundByLocation[index]  =  (CAEmployee) employee;
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
    public CAEmployee[] findAll(){
        CAEmployee[] foundByLocation = new CAEmployee[10];
        int index = 0;
        Employee[] employees = super.findAll();
        for(Employee employee:employees){
            if(employee!=null){
                foundByLocation[index]  =  (CAEmployee) employee;
                index++;
            }
        }
        return foundByLocation;
    }
}
