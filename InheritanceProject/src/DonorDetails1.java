
import java.util.Scanner;
public class DonorDetails1 {

			private String name;
			private int age;
			private String gender;
			private String bloodGroup;
			private long phoneNumber;
			

			public DonorDetails1(String name, int age, String gender, String bloodGroup, long phoneNumber) {
				super();
				
				this.name = name;
				this.age = age;			
				this.gender = gender;
				this.bloodGroup = bloodGroup;
				this.phoneNumber = phoneNumber;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

			public String getGender() {
				return gender;
			}

			public void setGender(String gender) {
				this.gender = gender;
			}

			public String getBloodGroup() {
				return bloodGroup;
			}

			public void setBloodGroup(String bloodGroup) {
				this.bloodGroup = bloodGroup;
			}

			public long getPhoneNumber() {
				return phoneNumber;
			}

			public void setPhoneNumber(long phoneNumber) {
				this.phoneNumber = phoneNumber;
			}
			
			class DonorDetails{

				public static void main(String []args) {
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter Donor Details");
					System.out.println("Enter the name");				
					String name=sc.nextLine();
					System.out.println("Enter the age");
					int age=sc.nextInt();
					System.out.println("Enter the gender");
					String gender=sc.next();
					System.out.println("Enter the bloodGroup");
					String bloodGroup=sc.next();
					System.out.println("Enter the phoneNunmber");
					long phoneNumber=sc.nextLong();
					System.out.println();
					
					DonorDetails1 Dd=new DonorDetails1(name,age,gender,bloodGroup,phoneNumber);
					
					System.out.println("Displaying DonorDetails");
					System.out.println("name :"+Dd.getName());
					System.out.println("age :"+Dd.getAge());
					System.out.println("gender :"+Dd.getGender());
					System.out.println("bloodGroup :"+Dd.getBloodGroup());
					System.out.println("phoneNumber :"+Dd.getPhoneNumber());
					
				}
			}




}
	      
 
	


