package de.varablen;

public class Sichtbarkeiten
{
	private int klassenvariable = 0;

	private String variable = "Ich bin eine Klassenvariable";

	public void printKlassenvarable()
	{
		System.out.println(klassenvariable);
	}

	public void increaseKlassenvariable()
	{
		klassenvariable++; // alternativ auch
		// klassenvariable += 1; oder
		// klassenvariable = klassenvariable + 1
	}
}
