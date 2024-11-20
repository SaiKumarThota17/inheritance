class Employee1 {
    private int employeeID;
    private String name;
    private String position;

    public Employee1(int employeeID, String name, String position) {
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }
}

class Manager1 extends Employee1 {
    private String department;

    public Manager1(int employeeID, String name, String position, String department) {
        super(employeeID, name, position);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

public class Question17 {
    public static void main(String[] args) {
        Manager1 manager = new Manager1(11234, "sai", "HR", "Developer");
        System.out.println("Employee ID: " + manager.getEmployeeID());
        System.out.println("Name: " + manager.getName());
        System.out.println("Position: " + manager.getPosition());
        System.out.println("Department: " + manager.getDepartment());
    }
}

