package model;

public class TestAutor
{
	public static void main(String[] args)
	{
		Autor a = new Autor();
		Buch b = new Buch();
		b.setTitel("Wie ich lernte Java zu hassen ohne unter zu gehen");
		a.hinzufuegen(b);
		b = new Buch();
		b.setTitel("Meine Liebe zu Java");
		a.hinzufuegen(b);
		a.buecherAuflistenAlteVersion();
		a.buecherAuflisten();
		
	}
}
