package Employeems;

public class ElecEmployee extends Employee {
    private String profile;

    public ElecEmployee() {
    }

    public ElecEmployee(String name, int age, String location, String profile) {
        super(name,age,location);
        this.profile = profile;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
}
