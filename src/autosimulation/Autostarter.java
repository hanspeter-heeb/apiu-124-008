package autosimulation;

public class Autostarter
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		Hoerbar m = new Dieselmotor();
		Auto a = new Auto(m);
		a.setRaeder(6);
		a.setRost(9.9);
		System.out.println(a.getRost());
		a.rostEntfernen();
		a.fahre();
		System.out.println(a.getRost());
		a=null;
	}

}
