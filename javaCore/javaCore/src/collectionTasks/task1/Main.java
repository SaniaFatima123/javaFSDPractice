package collectionTasks.task1;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        EmployeeStore employeeStore = new EmployeeStore();
        Employee employee1 = new Employee("Chiku", 19);
        employeeStore.addEmp(employee1);
        Employee employee2 = new Employee("Anand", 22);
        employeeStore.addEmp(employee2);
        employeeStore.addEmp(new Employee("Anand", 23));

        //Finding by id
        System.out.println("Finding employee by id **************");
        int id = 5;
        Employee foundEmployeeId = employeeStore.findById(id);
        if (foundEmployeeId == null) {
            System.out.println("Employee with ID " + id + " is not present.");
        } else {
            obj.display(foundEmployeeId);
        }
        System.out.println("***************************************");

        //Finding employee by name
        System.out.println("Finding employee by name **************");
        String name = "Anand";
        List<Employee> foundEmployeeByName = employeeStore.findByName(name);
        obj.display(foundEmployeeByName);
        System.out.println("***************************************");

        //Finding employee by Age>20
        System.out.println("Finding employee by age **************");
        List<Employee> foundEmployees = employeeStore.findByAgeGreaterThan20();
        obj.display(foundEmployees);
        System.out.println("***************************************");
    }

    public void display(Employee employee) {
        if (employee != null) {
            System.out.println("Employee ID is " + employee.getId() + " Employee is " + employee.getName()
                    + " Age is " + employee.getAge());
        }
    }

    public void display(Collection<Employee> employees) {
        for (Employee employee : employees) {
            display(employee);
        }
    }
}
