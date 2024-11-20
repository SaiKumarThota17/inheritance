import java.util.Scanner;

class Shape
{
	float area;
	public void area()
	{
	System.out.println("Enter the values");	
	}
}
class Square extends Shape
{
	int length;
	public void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the area");
		length=sc.nextInt();
		area=length*length;
		System.out.println(area);
	}
}
class Rectangle extends Shape
{
	int length;
	int breadth;
	public void area() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		length=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle10");
		breadth=sc.nextInt();
		area=length*length;
		System.out.println(area);

	}
}
class Circle extends Shape
{
	float pi=3.142f;
	float radius;
	public void area()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		radius=sc.nextFloat();
		area=pi*radius*radius;
		System.out.println(area);
	}
}


public class Question02 {

	public static void main(String[] args) {
		Square s=new Square();
			   s.area();
     Rectangle r=new Rectangle();
			   r.area();
	    Circle c=new Circle();
	    	   c.area();

	}

}
