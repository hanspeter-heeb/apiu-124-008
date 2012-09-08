package haus;

public class Fenster
{

	private int id;

	public Fenster(int i)
	{	this();
		id=i;
	}

	public Fenster()
	{
	}

	public void oeffnen()
	{
		System.out.println("Fenster "+id+" öffnen");
	}

	public void schliessen()
	{
		System.out.println("Fenster "+id+" schliessen");
	}

	public void warten()
	{
		System.out.println("Fünf Minuten warten");
	}

}
