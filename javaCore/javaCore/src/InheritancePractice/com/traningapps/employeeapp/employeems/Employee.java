package InheritancePractice.com.traningapps.employeeapp.employeems;

import InheritancePractice.com.traningapps.employeeapp.departmentms.Department;

public class Employee {
    private long id;
    private String name;
    private int age;
    private String country;
    private double salary;
    private Department department;

    public Employee() {
    }

    public Employee(long id, String name, int age, String country, double salary, Department department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.country = country;
        this.salary = salary;
        this.department = department;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }
}
