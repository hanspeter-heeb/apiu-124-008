package haus;

import java.util.ArrayList;
import java.util.List;

public class Haus
{

	private List<Zimmer> zimmerListe = new ArrayList<Zimmer>();

	public void add(Zimmer zimmer)
	{
		zimmerListe.add(zimmer);
	}

	public void stossLueften()
	{	int i=1;
		for (Zimmer z : zimmerListe)
		{
			System.out.println("Stosslueften Zimmer "+(i++));
			z.stossLueften();
		}
	}

	public void fensterOeffnen()
	{
		int i=1;
		for (Zimmer z : zimmerListe)
		{
			System.out.println("Fenster öffnen Zimmer "+(i++));
			z.fensterOeffnen();
		}
	}

	public void fensterSchliessen()
	{
		int i=1;
		for (Zimmer z : zimmerListe)
		{
			System.out.println("Fenster schliessen Zimmer "+(i++));
			z.fensterSchliessen();
		}
	}

}
