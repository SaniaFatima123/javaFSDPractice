package collectionTasks.task2;

import collectionTasks.task1.Employee;
import collectionTasks.task1.EmployeeStore;

import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        EmployeeStore employeeStore = new EmployeeStore();
        employeeStore.addEmp(new Employee("Saurav kumar Jha", 23));
        employeeStore.addEmp(new Employee("Anand kumar Jha", 22));
        employeeStore.addEmp(new Employee("Chiku kumar Jha", 19));

        //Finding by id
        System.out.println("Finding by Id ********************************");
        int id = 2;
        Employee foundEmpById = employeeStore.findById(id);
        obj.display(foundEmpById);
        System.out.println("******************************************************************");

        //Finding by name
        System.out.println("Finding by Name ********************************");
        String name = "Chiku kumar Jha";
        List<Employee> foundEmpByName = employeeStore.findByName(name);
        obj.display(foundEmpByName);

        //FindingByAgeGreaterThan20
        System.out.println("Finding by Age greater than 20 ******************");
        List<Employee> foundEmpByAge = employeeStore.findByAgeGreaterThan20();
        obj.display(foundEmpByAge);
    }

    //for displaying id
    public void display(Employee employee) {
        if (employee != null) {
            System.out.println("Employee id is " + employee.getId() + " Employee name is " + employee.getName()
                    + " Employee Age is " + employee.getAge());
        }
    }

    //for displaying findByName, FindingByAgeGreaterThan20
    public void display(Collection<Employee> employees) {
        for (Employee employee : employees) {
            display(employee);
        }
    }

}
