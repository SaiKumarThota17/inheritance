
class Animal
{
	String name;
	int age;
	public void eat()
	{	
		System.out.println("Animal Eating");
	}
	public void sleep()
	{
		System.out.println("Animal Sleeping");
	}
}

class Mammal extends Animal
{
	public void makeSound()
	{
		name="Tiger";
		System.out.println("Enter the Mammal Animal:" +name);
		age=12;
		System.out.println("Enter the tiger age:" +age);
	}
	public void eat()
	{
		System.out.println("Tiger Eating");
	}
	public void sleep()
	{
		System.out.println("Tiger Sleeping");
	}
}

class Bird extends Animal
{
	public void makeSound()
	{
		name="Pegion";
		System.out.println("Enter the Pegion bird:" +name);
		age=7;
		System.out.println("Enter the Pegion age:" +age);	
	}
	public void eat()
	{	
		System.out.println("Pegion Eating");
	}
	public void sleep()
	{
		System.out.println("Pegion Sleeping");
	}
}

class Reptile extends Animal
{
	public void makeSound()
	{
		name="Python";
		System.out.println("Enter the Python Reptile Animal:" +name);
		age=7;
		System.out.println("Enter the Python age:" +age);
		
		
	}
	public void eat()
	{	
		System.out.println("Python Eating");
	}
	public void sleep1()
	{
		System.out.println("Python Sleeping");
	}
}



public class Question05 {

	public static void main(String[] args) {
		Mammal m=new Mammal();
		       m.makeSound();
		       m.eat();
		       m.sleep();
	      Bird b =new Bird();
		       b.makeSound();
		       b.eat();
		       b.sleep();
	   Reptile r=new Reptile();
	           r.makeSound();
	           r.eat();     
	           r.sleep();
	   		   
	}

}
