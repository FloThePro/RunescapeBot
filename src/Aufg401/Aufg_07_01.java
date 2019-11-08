package Aufg401;

public class Aufg_07_01 {

	private String titel, figur;
	private int jahr;
	
	public Aufg_07_01(String titel, String figur, int jahr) {
		this.titel = titel;
		this.figur = figur;
		this.jahr = jahr;
	}
	
	public Aufg_07_01() {
		this("kein Titel", "keine Figur", 0);
	}
	
	public void print() {
		System.out.println("Titel: " + titel);
		System.out.println("Figur: " + figur);
		System.out.println("Jahr: " + jahr);
	}
}
