package haus;

public class StarterHaus
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Haus h = new Haus();
		h.add(new Zimmer(4));
		h.add(new Zimmer(3));
		h.add(new Zimmer(5));
		System.out.println("Beginne Stosslüften");
		h.stossLueften();
		System.out.println("Beginne Durchzug");
		h.fensterOeffnen();
		System.out.println("Beende Durchzug");
		h.fensterSchliessen();
		
	}

}
