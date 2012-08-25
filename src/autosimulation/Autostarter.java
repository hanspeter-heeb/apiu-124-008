package autosimulation;

public class Autostarter
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Auto a = new Auto();
		a.setRaeder(6);
		a.setRost(9.9);
		System.out.println(a.getRost());
		a.rostEntfernen();
		System.out.println(a.getRost());
	}

}
