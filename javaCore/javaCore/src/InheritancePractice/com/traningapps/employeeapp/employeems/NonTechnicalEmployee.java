package InheritancePractice.com.traningapps.employeeapp.employeems;

import InheritancePractice.com.traningapps.employeeapp.departmentms.Department;

public class NonTechnicalEmployee extends Employee{
    private String skill;

    private int experienceWithSkillInYrs;

    public NonTechnicalEmployee() {
    }

    public NonTechnicalEmployee(long id, String name, int age, String country, double salary, Department department, String skill, int experienceWithSkillInYrs) {
        super(id, name, age, country, salary, department);
        this.skill = skill;
        this.experienceWithSkillInYrs = experienceWithSkillInYrs;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getExperienceWithSkillInYrs() {
        return experienceWithSkillInYrs;
    }

    public void setExperienceWithSkillInYrs(int experienceWithSkillInYrs) {
        this.experienceWithSkillInYrs = experienceWithSkillInYrs;
    }

    @Override
    public String toString() {
        return "NonTechnicalEmployee{" +
                "skill='" + skill + '\'' +
                ", experienceWithSkillInYrs=" + experienceWithSkillInYrs +
                '}';
    }
}
