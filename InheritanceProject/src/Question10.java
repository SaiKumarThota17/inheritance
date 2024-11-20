class Instrument
{
	protected String type;
	protected String brand;
	
	public void tune() 
	{
		System.out.println("playing tune");
	}
	 void play(String type,String brand) {
		
		this.type=type;
		this.brand=brand;
	}
	public void clean()
	{
		System.out.println("cleaninng instruments");
		System.out.println("-----------------------");
	}
	
}
class Guiter extends Instrument
{
	@Override
	protected void play(String type,String brand)
	{
		System.out.println(type+ " Playing Guiter"+brand);
	}
}
class Piano extends Instrument
{
	@Override
	public void play(String type,String brand)
	{
		
		System.out.println(type+ " Playing Piano"+brand);
	}
}
class Drums extends Instrument
{
	@Override
	public void play(String type,String brand)
	{
		System.out.println(type+" Playing Drums"+brand);	
	}
}



public class Question10 {

	public static void main(String[] args) {
		
		Guiter g=new Guiter();
			   g.tune();
			   g.play("Classic Guiter","Henrix");
			   g.clean();
	     Piano p=new Piano();
			   p.tune();
			   p.play("Spinet","Kawai");
			   p.clean();
	     Drums d=new Drums();
			   d.tune();
			   d.play("Bangos","pearl");
			   d.clean();
		
		

	}

}
