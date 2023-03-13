package InterfaceEnumTask.com.traningapps.employeeapp.employeems;

import InterfaceEnumTask.com.traningapps.employeeapp.departmentms.Department;


public class ElectronicsEmployee extends Employee {
    private String deviceUsed;
    private int ExpInYears;

    public ElectronicsEmployee() {
    }

    public ElectronicsEmployee(long id, String name, int age, Department department, String country, Location location, double salary, String deviceUsed, int expInYears) {
        super(id, name, age,department, country, location, salary);
        this.deviceUsed = deviceUsed;
        ExpInYears = expInYears;
    }

    public String getDeviceUsed() {
        return deviceUsed;
    }

    public void setDeviceUsed(String deviceUsed) {
        this.deviceUsed = deviceUsed;
    }

    public int getExpInYears() {
        return ExpInYears;
    }

    public void setExpInYears(int expInYears) {
        ExpInYears = expInYears;
    }

    @Override
    public String toString() {
        return "ElectronicsEmployee{" +
                "deviceUsed='" + deviceUsed + '\'' +
                ", ExpInYears=" + ExpInYears +
                '}';
    }
}
