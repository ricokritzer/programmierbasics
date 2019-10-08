package de.varablen;

public class Parameter
{
	public static void main(String[] args)
	{
		new Parameter("Das ist ein Text, der übergeben wird");
	}

	public Parameter(String text) // Construktor mit Parameter
	{
		schreibeTextAufKonsole(text);
	}

	private void schreibeTextAufKonsole(String auszugebenerText)
	{
		System.out.println(auszugebenerText);
	}
}
