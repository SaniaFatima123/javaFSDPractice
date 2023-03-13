package Employeems;

public class Main {
    public static void main(String[] args) {
        Employee employees[] = new Employee[3];
        Employee elec1 = new ElecEmployee("Ali",20,"Bangalore","Transistor Engineer");
        Employee elec2 = new ElecEmployee("Suzan",21,"USA","PJP Transistor Engineer");
        Employee itEmp = new ITEmployee("chiku",19,"Gurgaon","Turbo Engineer");
        employees[0] = elec1;
        employees[1] = elec2;
        employees[2] = itEmp;
        for(Employee employee:employees){
            System.out.println("Name is "+employee.getName());
            System.out.println("Age is "+employee.getAge());
            System.out.println("Location is "+employee.getLocation());
            boolean isElec = employee instanceof ElecEmployee;
            if(isElec){
                ElecEmployee elecEmployee = (ElecEmployee) employee;
                System.out.println("Profile is "+elecEmployee.getProfile());
            }
            boolean isIt = employee instanceof ITEmployee;
            if(isIt){
                ITEmployee itEmployee = (ITEmployee) employee;
                System.out.println("Designation is "+itEmployee.getDesignation());
            }
        }
    }
}
