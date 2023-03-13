package AbstractTask.com.traningapps.studentapp.studentms;


import AbstractTask.com.traningapps.studentapp.departmentms.Department;

public class EceStudent extends Student{
   private String deviceUsed;

    private int experienceWithDeviceInYrs;

    public EceStudent() {
    }

    public EceStudent(long id, String name, Department department, String deviceUsed, int experienceWithDeviceInYrs) {
        super(id, name, department);
        this.deviceUsed = deviceUsed;
        this.experienceWithDeviceInYrs = experienceWithDeviceInYrs;
    }

    public String getDeviceUsed() {
        return deviceUsed;
    }

    public void setDeviceUsed(String deviceUsed) {
        this.deviceUsed = deviceUsed;
    }

    public int getExperienceWithDeviceInYrs() {
        return experienceWithDeviceInYrs;
    }

    public void setExperienceWithDeviceInYrs(int experienceWithDeviceInYrs) {
        this.experienceWithDeviceInYrs = experienceWithDeviceInYrs;
    }

    @Override
    public String toString() {
        return "EceStudent{" +
                "deviceUsed='" + deviceUsed + '\'' +
                ", experienceWithDeviceInYrs=" + experienceWithDeviceInYrs +
                '}';
    }
}
