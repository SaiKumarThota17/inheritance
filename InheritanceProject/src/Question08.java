
class Furniture
{
	protected String material;
	protected String colour;
	public void assemble()
	{
		System.out.println("Assemble Furniture");
	}
	public void dissemble()
	{
		System.out.println("Dissemble Furniture");
		System.out.println("------------------------");
	}
	
}
class Chair extends Furniture
{
	public void sitOn(String material,String colour)
	{
		this.material=material;
		System.out.println("Material: "+material);
		this.colour=colour;
		System.out.println("Colour: "+colour);
		System.out.println("Sitting on the chair");
	}
}
class Table extends Furniture
{
	public void sitOn(String material,String colour)
	{
		this.material=material;
		System.out.println("Material: "+material);
		this.colour=colour;
		System.out.println("Colour: "+colour);
		System.out.println("putting things on the Table");
	}	
}
class Sofa extends Furniture
{
	public void sitOn(String material,String colour)
	{
		this.material=material;
		System.out.println("Material: "+material);
		this.colour=colour;
		System.out.println("Colour: "+colour);
		System.out.println("relaxing on the sofa");
		
	}	
}



public class Question08 {

	public static void main(String[] args) {
		Chair c=new Chair();
			  c.assemble();
			  c.sitOn("Fabric","Red");
			  c.dissemble();
	
	    Table t=new Table();
			  t.assemble();
			  t.sitOn("Wood","Gray");
			  t.dissemble();
         Sofa s=new Sofa();
			  s.assemble();
			  s.sitOn("Leather","Blue");
			  s.dissemble();
			  
		

	}

}
