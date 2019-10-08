package de.varablen;

public class Sichtbarkeiten
{
	private int klassenvariable = 0;

	private String variable = "Text B?";

	public void printKlassenvarable()
	{
		System.out.println(klassenvariable);
	}

	public void increaseKlassenvariable()
	{
		klassenvariable++; // alternativ auch
		// klassenvariable += 1; oder
		// klassenvariable = klassenvariable + 1;
	}

	public void printVariable(String variable)
	{
		System.out.println(variable);
	}

	public static void main(String[] args)
	{
		// Aufgabe: was wird ausgegeben: Text A oder B?
		new Sichtbarkeiten().printVariable("Text A?");
	}
}
