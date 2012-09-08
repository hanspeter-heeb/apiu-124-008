package model;

import java.util.List;

public class Buch
{
	private static final int NOT_SAVED=-1;
	
	private int id=NOT_SAVED;
	private String titel;
	private Autor autor;
	private Mitarbeiter erfasser;
	
	public boolean isAusgeliehen()
	{
		return ausgeliehen;
	}

	private boolean ausgeliehen;
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		if (this.id==NOT_SAVED)
		this.id = id;
	}
	public String getTitel()
	{
		return titel;
	}
	public void setTitel(String titel)
	{
		this.titel = titel;
	}
	public Autor getAutor()
	{
		return autor;
	}
	public void setAutor(Autor autor)
	{
		this.autor = autor;
	}
	public Mitarbeiter getErfasser()
	{
		return erfasser;
	}
	public void setErfasser(Mitarbeiter erfasser)
	{
		this.erfasser = erfasser;
	}
	
	public Buch suchen(int id)
	{
		return new Buch();
	}
	
	public List<Buch> suchen(String titel)
	{
		return null;
	}
	
	
}
