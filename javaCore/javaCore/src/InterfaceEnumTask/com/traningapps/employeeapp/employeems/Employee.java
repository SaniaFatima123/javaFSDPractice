package InterfaceEnumTask.com.traningapps.employeeapp.employeems;

import InterfaceEnumTask.com.traningapps.employeeapp.departmentms.Department;

public class Employee {
    private long id;
    private String name;
    private int age;
    private Department department;
    private String country;
    private Location location;
    private double salary;

    public Employee() {
    }

    public Employee(long id, String name, int age, Department department, String country, Location location, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.country = country;
        this.location = location;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department=" + department +
                ", country='" + country + '\'' +
                ", location=" + location +
                ", salary=" + salary +
                '}';
    }
}
