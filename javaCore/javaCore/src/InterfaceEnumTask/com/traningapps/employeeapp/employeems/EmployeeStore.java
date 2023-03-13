package InterfaceEnumTask.com.traningapps.employeeapp.employeems;


public abstract class EmployeeStore {
    private Employee[] employees;

    public EmployeeStore(int capacity) {
        employees = new Employee[capacity];
    }

    private int index = 0;

    public Employee addEmployee(Employee employee) {
        if (employee != null && index < employees.length) {
            employees[index] = employee;
            index++;
            return employee;
        }
        return null;
    }

    public Employee findById(long id) {
        for (Employee emp : employees) {
            if (emp != null && emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public Employee[] findByLocation(Location location) {
        Employee[] foundEmployeeByLocation = new Employee[5];
        int index = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getLocation() == location) {
                foundEmployeeByLocation[index] = employee;
                index++;
            }
        }
        return foundEmployeeByLocation;
    }

    public String updateEmployee(long id, double salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                employee.setSalary(salary);
                return "Salary has been Updated for Employee whose ID is " + id;
            }
        }
        return "Employee not found";
    }
    public void delete(long id){
        int index = 0;
        for(Employee employee: employees){
            if(employee!=null && employee.getId()==id){
                employees[index] = null;
                index++;
            }
        }
    }

    public Employee[] findAll() {
        return employees;
    }

}
