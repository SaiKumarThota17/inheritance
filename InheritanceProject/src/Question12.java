class FoodItem
{
	protected String name;
	protected float calories;
	public void consume()
	{
		System.out.println("Food Consuming");
	}
	public void prepeare(String name,float calories)
	{
		this.name=name;
		this.calories=calories;
	}
	public void digest()
	{
		System.out.println("Food Digesting");
		System.out.println("--------------------------------");
	}
}
class Fruit extends FoodItem
{
	@Override
	public void prepeare(String name,float calories)
	{
		System.out.println(name+" eating"+" "+calories+" Calories");
	}
}
class Vegitable extends FoodItem
{
	@Override
	public void prepeare(String name,float calories)
	{
		
		System.out.println(name+" preparing curry"+" "+calories+" Calories");
	}
}
class DairyProduct extends FoodItem
{
	@Override
	public void prepeare(String name,float calories)
	{
		System.out.println(name+" Energy Drinking"+" "+calories+" Calories");
		
	}
}

public class Question12 {

	public static void main(String[] args) {
		Fruit f=new Fruit();
			  f.consume();
			  f.prepeare("Apple",52.5f);
			  f.digest();
    Vegitable v=new Vegitable();
			  v.consume();
			  v.prepeare("Brinjal",25.5f);
			  v.digest();
 DairyProduct d=new DairyProduct();
			  d.consume();
			  d.prepeare("Milk",42.7f);
			  d.digest();
		

	}

}
