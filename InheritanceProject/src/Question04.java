class Vehicle
{
	String make;
	String model;
	public void startEngine()
	{
		System.out.println("Vehilce Startimg");
	}
	public void StopEngine()
	{
		System.out.println("Vehilce Stoping");
		System.out.println("__________________________");
		
	}
}
class Car extends Vehicle
{
	public void acceleration()
	{
		make="benz";
		model="EQS";
		System.out.println(make+""+model);
	}
}
class MotorCycle extends Vehicle
{
	public void acceleration()
	{
		make="KTM";
		model="Duke200";
		System.out.println(make+""+model);
		
	}
}
class Truck extends Vehicle
{
	public void acceleration()
	{
		make="Mahendra";
		model="Blazo X 48"; 
		System.out.println(make+""+model);
		
	}
}


public class Question04 {

	public static void main(String[] args) {
		Car c=new Car();
			c.startEngine();
		    c.acceleration();
		    c.StopEngine();
 MotorCycle m=new MotorCycle();
			m.startEngine();
		    m.acceleration();
		    m.StopEngine();
      Truck t=new Truck();
	     	t.startEngine();
		    t.acceleration();
		    t.StopEngine();
	}

}
