
class Computer
{
	public void playGames()
	{
		System.out.println("Kids are playing games in Pc");
	}
}
class Laptop extends Computer
{
	public void playGames()
	{
		System.out.println("Laptop have using pc games ");
	}

}
class Desktop extends Computer
{
	public void playGames()
	{
		System.out.println("Desktop is displaying representing ");
	}
}
class Mobile extends Computer
{
	public void playGames()
	{
		System.out.println("Mobiles have using andrid versions Games");
	}
}

public class Question3 {

	public static void main(String[] args) {
		Laptop l=new Laptop();
			   l.playGames();
		Desktop d=new Desktop();
				d.playGames();
		Mobile m=new Mobile();
			   m.playGames();

	}

}
