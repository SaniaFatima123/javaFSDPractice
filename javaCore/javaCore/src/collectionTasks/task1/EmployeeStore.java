package collectionTasks.task1;

import collectionTasks.task1.exceptions.InvalidAgeException;
import collectionTasks.task1.exceptions.InvalidIdException;
import collectionTasks.task1.exceptions.InvalidNameException;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStore {
    List<Employee> employees = new ArrayList<Employee>();
    private int generatedId;

    private int generateId() {
        return ++generatedId;
    }

    public void addEmp(Employee employee) {
        int id = generateId();
        employee.setId(id);
        employees.add(employee);
    }

    public List<Employee> findByName(String name) {
        validateName(name);
        List<Employee> foundEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee != null && employee.getName().equalsIgnoreCase(name)) {
                foundEmployees.add(employee);
            }
        }
        return foundEmployees;
    }

    public Employee findById(int id) {
        validateId(id);
        for(Employee employee:employees){
            if(employee!=null && employee.getId()==id){
                return employee;
            }
        }
        return null;
    }

    public List<Employee> findByAgeGreaterThan20(){
        List<Employee> foundEmployeeAge = new ArrayList<>();
        for(Employee employee:employees){
            if(employee!=null && employee.getAge()>20){
                foundEmployeeAge.add(employee);
            }
        }
        return foundEmployeeAge;
    }

    private void validateId(int id){
        if(id<=0 || id>1000){
            throw new InvalidIdException("ID that you entered is invalid");
        }
    }
    private void validateAge(int age){
        if(age<=0 || age>120){
            throw new InvalidAgeException("Age that you entered is invalid");
        }
    }
    private void validateName(String name){
        if(name==null || name.isBlank() || name.isEmpty() || name.length()==0){
            throw new InvalidNameException("Name that you entered is invalid");
        }
    }


}
