package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Autor
{
	private String name;
	private String vorname;
	private List<Buch> buecher = new LinkedList<Buch>();
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getVorname()
	{
		return vorname;
	}
	public void setVorname(String vorname)
	{
		this.vorname = vorname;
	}
	
	public void hinzufuegen(Buch b)
	{
		this.buecher.add(b);
	}
	
	public boolean entfernen(Buch b)
	{
		return this.buecher.remove(b);
	}
	
	public Buch entfernen()
	{
		return this.buecher.remove(0);
	}
	
	
	
	public List<Buch> getBuecher()
	{
		return buecher;
	}
	public void setBuecher(List<Buch> buecher)
	{
		this.buecher = buecher;
	}
	
	
	
	
}
