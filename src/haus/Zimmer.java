package haus;

import java.util.ArrayList;
import java.util.List;

public class Zimmer
{

	private List<Fenster> fenster = new ArrayList<Fenster>();

	public Zimmer(int fensterZahl)
	{	this();
		for(int i=0;i++<fensterZahl;)
		{
			fenster.add(new Fenster(i));
		}
	}

	public Zimmer()
	{
	}

	public void stossLueften()
	{
		System.out.println("Stosslueften ");
		for (Fenster f : fenster)
		{
			f.oeffnen();
		}
		if(fenster.size()>0)
			fenster.get(0).warten();
		for (Fenster f : fenster)
		{
			f.schliessen();
		}
	}

	public void fensterOeffnen()
	{
		
		for (Fenster f : fenster)
		{
			f.oeffnen();
		}
	}

	public void fensterSchliessen()
	{
		for (Fenster f : fenster)
		{
			f.schliessen();
		}
	}

}
