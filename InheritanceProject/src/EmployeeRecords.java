import java.util.ArrayList;

public class EmployeeRecords {

	private int employeeId;
	private String firstName;
	private String lastName;
	private int age;
	private float salary;
	ArrayList<EmployeeRecords> employee =new ArrayList<>();
		
	
	public EmployeeRecords(int employeeId, String firstName, String lastName, int age, float salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		
		
		
		
		
		

	}

}
