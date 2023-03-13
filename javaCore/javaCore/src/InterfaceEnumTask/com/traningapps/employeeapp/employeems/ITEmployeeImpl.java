package InterfaceEnumTask.com.traningapps.employeeapp.employeems;

public class ITEmployeeImpl extends EmployeeStore implements IITEmployee{
    public ITEmployeeImpl(int capacity){
        super(capacity);
    }
    @Override
    public ITEmployee addEmployee(ITEmployee itEmployee){
       Employee employee =  super.addEmployee(itEmployee);
       return (ITEmployee) employee;
    }
    @Override
    public ITEmployee findById(long id){
       Employee employee =  super.findById(id);
       return (ITEmployee) employee;
    }
    @Override
    public ITEmployee[] findByLocation(Location location){
        ITEmployee[] foundByLocation = new ITEmployee[10];
        int index = 0;
        Employee[] employees = super.findByLocation(location);
        for(Employee employee:employees){
            if(employee!=null){
                foundByLocation[index]  =  (ITEmployee) employee;
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
    public ITEmployee[] findAll(){
        ITEmployee[] foundByLocation = new ITEmployee[10];
        int index = 0;
        Employee[] employees = super.findAll();
        for(Employee employee:employees){
            if(employee!=null){
                foundByLocation[index]  =  (ITEmployee) employee;
                index++;
            }
        }
        return foundByLocation;
    }

}
