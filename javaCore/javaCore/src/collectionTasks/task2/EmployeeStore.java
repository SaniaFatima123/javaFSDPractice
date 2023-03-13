package collectionTasks.task2;

import java.util.*;

public class EmployeeStore {
    Map<Integer,Employee> employees = new HashMap<>();

    private int generatedId;
    private int generateId(){

        return  ++generatedId;
    }
    public void addEmployee(Employee employee){
        int id =generateId();
        employee.setId(id);
        employees.put(id,employee);
    }
    public Employee findById(int id) {
        Set<Integer> keys = employees.keySet();
        for(Integer key: keys){
            if(key==id){
               return employees.get(key);
            }
        }
        return null;
    }

    public List<Employee> findByName(String name){
        List<Employee> foundNames = new ArrayList<>();
        Set<Integer> keys= employees.keySet();
        for(Integer key: keys){
            if(employees.get(key).getName().equalsIgnoreCase(name)){
                foundNames.add(employees.get(key));
            }
        }
        return foundNames;
    }

    public List<Employee> findByAgeGreaterThan20(){
        List<Employee> foundNames = new ArrayList<>();
        Set<Integer> keys= employees.keySet();
        for(Integer key: keys){
            if(employees.get(key).getAge()>20){
                foundNames.add(employees.get(key));
            }
        }
        return foundNames;
    }


}
