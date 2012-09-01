package autosimulation;

import java.util.ArrayList;
import java.util.List;

public class Auto
{
	@SuppressWarnings("unused")
	private List<Rad> raeder = new ArrayList<Rad>();

	private double rost;

	private Hoerbar motor;

	public Auto(Hoerbar m)
	{
		this();
		motor = m;
	}

	public Auto()
	{
		super();
	}

	public double getRost()
	{
		return rost;
	}
	
	public void fahre()
	{
		for (Rad r : raeder)
		{
			r.drehe();
		}
		motor.laufe();
	}
	
	public void setRaeder(int anzahl)
	{
		for (int i = 0; i < anzahl; i++)
		{
			raeder.add(new Rad());
		}
	}

	public void rostEntfernen()
	{
		rost = rost/10;
		System.out.println("Habe 90% des Rostes entfernt.");
	}

	public void setRost(double r)
	{
		rost = r;
	}

}
