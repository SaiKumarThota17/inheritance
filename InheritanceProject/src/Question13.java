class Clothing
{
	protected String type;
	protected String size;
	public void wear()
	{
		System.out.println("Wearing Clothes");
	}
	public void iron(String type,String size)
	{
		this.type=type;
		this.size=size;
	}
	public void remove()
	{
		System.out.println("Remove Clothes");
		System.out.println("--------------------------------");
	}
}
class Shirt extends Clothing
{
	@Override
	public void iron(String type,String size)
	{
		System.out.println(type+" Traditional wearing"+" "+size+" Shirt");
	}
}
class Pants extends Clothing
{
	@Override
	public void iron(String type,String size)
	{
		
		System.out.println(type+" Casual "+" "+size+" Pant");
	}
}
class Dress extends Clothing
{
	@Override
	public void iron(String type,String size)
	{
		System.out.println(type+" PartyWear"+" "+size+" Dress");
		
	}
}
public class Question13 {

	public static void main(String[] args) {
		Shirt s=new Shirt();
			  s.wear();
			  s.iron("Linen", "Medium");
			  s.remove();
	    Pants p=new Pants();
			  p.wear();
			  p.iron("Joggers", "Large");
			  p.remove();
	    Dress d=new Dress();
			  d.wear();
			  d.iron("Blazer", "Small");
			  d.remove();
			  
			  
			  
			  
			  
			  
			  
			  
			  

	}

}
