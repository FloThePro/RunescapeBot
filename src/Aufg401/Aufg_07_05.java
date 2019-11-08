package Aufg401;

public class Aufg_07_05 {

	String sorte;
	int liter, fassId;
	private static int anzahlFaesser = 0;
	private static int literGesamt = 0;
	
	public Aufg_07_05(String sorte, int liter) {
		this.sorte = sorte;
		this.liter = liter;
		literGesamt = literGesamt + liter;
		anzahlFaesser = anzahlFaesser + 1;
		fassId = anzahlFaesser;
	}
	
	public void zapfen(int liter) {
		literGesamt = literGesamt - liter;
		this.liter = this.liter - liter;
		System.out.println("Das Bierfass mit der ID:" + fassId);
		System.out.println("Hat " + this.liter + " Liter.");
		System.out.println("Gezapft wurden " + liter + " Liter");
	}
	public void print() {
		
	}

	public static int getAnzahlFaesser() {
		return anzahlFaesser;
	}

	public static int getLiterGesamt() {
		return literGesamt;
	}
}
