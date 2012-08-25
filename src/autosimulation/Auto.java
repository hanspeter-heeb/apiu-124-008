package autosimulation;

import java.util.ArrayList;
import java.util.List;

public class Auto
{
	@SuppressWarnings("unused")
	private List<Rad> raeder = new ArrayList<Rad>();

	private double rost;

	public double getRost()
	{
		return rost;
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
