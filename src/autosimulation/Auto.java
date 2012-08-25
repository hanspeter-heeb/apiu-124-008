package autosimulation;

public class Auto
{

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
