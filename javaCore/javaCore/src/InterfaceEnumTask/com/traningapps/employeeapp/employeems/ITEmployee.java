package InterfaceEnumTask.com.traningapps.employeeapp.employeems;

import InterfaceEnumTask.com.traningapps.employeeapp.departmentms.Department;


public class ITEmployee extends Employee {
    private String languageUsed;
    private int codingExpinYrs;

    public ITEmployee() {
    }

    public ITEmployee(long id, String name, int age, Department department, String country, Location location, double salary, String languageUsed, int codingExpinYrs) {
        super(id, name, age,department, country, location, salary);
        this.languageUsed = languageUsed;
        this.codingExpinYrs = codingExpinYrs;
    }

    public String getLanguageUsed() {
        return languageUsed;
    }

    public void setLanguageUsed(String languageUsed) {
        this.languageUsed = languageUsed;
    }

    public int getCodingExpinYrs() {
        return codingExpinYrs;
    }

    public void setCodingExpinYrs(int codingExpinYrs) {
        this.codingExpinYrs = codingExpinYrs;
    }

    @Override
    public String toString() {
        return "ITEmployee{" +
                "languageUsed='" + languageUsed + '\'' +
                ", codingExpinYrs=" + codingExpinYrs +
                '}';
    }
}
