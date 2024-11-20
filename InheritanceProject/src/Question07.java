
class Employee
{
	String name;
	String designation;
	public void attendMeeting()
	{
		System.out.println("Attending Meeting");
	}
	public void submitReport()
	{
		System.out.println(" Submit Reporting");
		System.out.println("------------------------");
	}
}
class Manager extends Employee
{
	public void performDuties(String name,String designation)
	{
		this.name=name;
		this.designation=designation;
		System.out.println(name+" "+designation+" "+"is managing the team");
	}
}
class Engineer extends Employee
{
	public void performDuties(String name,String designation)
	{
		this.name=name;
		this.designation=designation;
		System.out.println(name+" "+designation+" "+"is devolping software");
	}
}
class Salesperson extends Employee
{
	public void performDuties(String name,String designation)
	{
		this.name=name;
		this.designation=designation;
		System.out.println(name+" "+designation+" "+"is selling products");
	}
}




public class Question07 {

	public static void main(String[] args) {
		Manager m=new Manager();
				m.attendMeeting();
				m.performDuties("Karthik","Manager");
				m.submitReport();
       Engineer r=new  Engineer();
				r.attendMeeting();
				r.performDuties("Sai","Enginner");
				m.submitReport();
		Salesperson s=new Salesperson();
				s.attendMeeting();
				s.performDuties("Surya","Salesperson");
				s.submitReport();

				
		

	}

}
