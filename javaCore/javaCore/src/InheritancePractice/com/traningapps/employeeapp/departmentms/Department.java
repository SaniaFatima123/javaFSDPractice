package InheritancePractice.com.traningapps.employeeapp.departmentms;

public class Department {
    private String id;
    private String name;
    private int noOfEmployee;

    public Department() {
    }

    public Department(String id, String name, int noOfEmployee) {
        this.id = id;
        this.name = name;
        this.noOfEmployee = noOfEmployee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfEmployee() {
        return noOfEmployee;
    }

    public void setNoOfEmployee(int noOfEmployee) {
        this.noOfEmployee = noOfEmployee;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", noOfEmployee=" + noOfEmployee +
                '}';
    }
}
