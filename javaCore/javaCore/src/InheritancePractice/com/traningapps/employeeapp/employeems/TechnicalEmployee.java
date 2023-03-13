package InheritancePractice.com.traningapps.employeeapp.employeems;

import InheritancePractice.com.traningapps.employeeapp.departmentms.Department;

public class TechnicalEmployee extends Employee{
    private String language;

    private int codingExperienceInYrs;

    public TechnicalEmployee() {
    }

    public TechnicalEmployee(long id, String name, int age, String country, double salary, Department department, String language, int codingExperienceInYrs) {
        super(id, name, age, country, salary, department);
        this.language = language;
        this.codingExperienceInYrs = codingExperienceInYrs;

    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getCodingExperienceInYrs() {
        return codingExperienceInYrs;
    }

    public void setCodingExperienceInYrs(int codingExperienceInYrs) {
        this.codingExperienceInYrs = codingExperienceInYrs;
    }


    @Override
    public String toString() {
        return "TechnicalEmployee{" +
                "language='" + language + '\'' +
                ", codingExperienceInYrs=" + codingExperienceInYrs +
                '}';
    }
}
