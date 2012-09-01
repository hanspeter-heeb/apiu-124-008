package autosimulation;

public class Sportwagen extends Auto
{
	public void lautesToenen(){
		System.out.println("Brumm laut");
	}
	
	public void fahre()
	{
		super.fahre();
		lautesToenen();
	}
}
