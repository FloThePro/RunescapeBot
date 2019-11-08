package Aufgaben8;

public class Zebra extends ZooTier{

	private int anzahlStreifen;
	
	public Zebra(int anzahlStreifen, int gewicht, String name) {
		this.anzahlStreifen = anzahlStreifen;
		super.gewicht = gewicht;
		super.name = name;
	}
	
	public int getAnzahlStreifen() {
		return anzahlStreifen;
	}
}