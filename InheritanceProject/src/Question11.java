
class Building
{
	protected String name;
	protected float height;
	public void occupy()
	{
		System.out.println("They occupied the place");
	}
	public void conductMeeting(String name,float height)
	{
		this.name=name;
		this.height=height;
	}
	public void evacute()
	{
		System.out.println("Safest Area");
	}
}
class House extends Building
{
	@Override
	public void conductMeeting(String name,float height)
	{
		System.out.println(name+" Living"+" Height "+height+" Meters");
	}
}
class OfficeBuilding extends Building
{
	@Override
	public void conductMeeting(String name,float height)
	{
		
		System.out.println(name+" helping peoples "+"Height "+height+" Meters");
	}
}
class SkyScraper extends Building
{
	@Override
	public void conductMeeting(String name,float height)
	{
		System.out.println(name+" Tallest Building in the World "+"Height "+height+" Meters");
		
	}
}




public class Question11 {

	public static void main(String[] args) {
		House h=new House();
			  h.occupy();
			  h.conductMeeting("palace",4.572f);
			  h.evacute();
			  System.out.println("-------------------------");
			  OfficeBuilding ob=new OfficeBuilding();
			  ob.occupy();
			  ob.conductMeeting("FireStation",8.2f);
			  ob.evacute();
			  System.out.println("-------------------------");
			  SkyScraper ss=new SkyScraper();
			  ss.occupy();
			  ss.conductMeeting("Burj Kalifa",828.5f);
			  ss.evacute();



	}

}
