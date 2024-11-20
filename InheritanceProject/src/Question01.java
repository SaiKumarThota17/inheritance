



class Plane
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
class CargoPlane extends Plane
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
class PassengerPlane extends Plane
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
class FighterPlane extends Plane
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


	

public class Question01 {

	public static void main(String[] args) {
		
	 	CargoPlane c=new CargoPlane();
	 		  c.takeOff();
		      c.fly();
		      c.cargoCourier();
		      c.land();
	    PassengerPlane p=new PassengerPlane();
	    	  p.takeOff();
		      p.fly();
		      p.passenger();
		      p.land();
       FighterPlane f=new FighterPlane();
       		  f.takeOff();
			  f.fly();
			  f.guns();
			  f.land();

	}

}
