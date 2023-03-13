package Employeems;

public class ITEmployee extends Employee {
    private String designation;

    public ITEmployee() {
    }

    public ITEmployee(String name, int age, String location, String designation) {
        super(name, age, location);
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
