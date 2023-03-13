package InterfaceEnumTask.com.traningapps.employeeapp.employeems;

import InterfaceEnumTask.com.traningapps.employeeapp.departmentms.Department;

public class CAEmployee extends Employee {
    private String skill;
    private int exp;

    public CAEmployee() {
    }

    public CAEmployee(long id, String name, int age, Department department, String country, Location location, double salary, String skill, int exp) {
        super(id, name, age,department, country, location, salary);
        this.skill = skill;
        this.exp = exp;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "CAEmployee{" +
                "skill='" + skill + '\'' +
                ", exp=" + exp +
                '}';
    }
}
