
class Plane1
{
	public void takeOff()
	{
		System.out.println("Plane is takeoff");
	}
	public void fly()
	{
		System.out.println("Plane is flying");
	}
	public void land()
	{
		System.out.println("Plane is landing");
		System.out.println("_________________________");
	}
}
class CargoPlane1 extends Plane1
{
	public void fly()
	{
		System.out.println("Cargoplane is flying");
	}
	public void cargoCourier()
	{
		System.out.println("Cargoplane carrying goods");
	}
}
class PassengerPlane1 extends Plane1
{
	public void fly()
	{
		System.out.println("PassengerPlane is medium flying");
	}
	public void passenger()
	{
		System.out.println("PassengerPlane is using for Travelling");
	}
}
class FighterPlane1 extends Plane1
{
	public void fly()
	{
		System.out.println("FighterPlane is flying higer range");
	}
	public void guns()
	{
		System.out.println("FighterPlane is carrying weapons");
	}
}


	

public class Question14 {

	public static void main(String[] args) {
		
	 	CargoPlane1 c=new CargoPlane1();
	 		  c.takeOff();
		      c.fly();
		      c.cargoCourier();
		      c.land();
	    PassengerPlane1 p=new PassengerPlane1();
	    	  p.takeOff();
		      p.fly();
		      p.passenger();
		      p.land();
       FighterPlane1 f=new FighterPlane1();
       		  f.takeOff();
			  f.fly();
			  f.guns();
			  f.land();

	}

}

