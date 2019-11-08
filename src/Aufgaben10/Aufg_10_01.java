package Aufgaben10;

public class Aufg_10_01 {

	public static void main(String[] args) {
		int zaehler, nenner;
		zaehler = 5;
		nenner = 0;
		
		berechnen(zaehler, nenner);
		
	}
	public static int berechnen(int zaehler, int nenner) throws ArithmeticException {
		int ergebnis = 0;
		try {
			ergebnis = zaehler/nenner;
		} catch (ArithmeticException e) {
			e.printStackTrace();	
			System.err.println("Fehlermeldung: "+e.getMessage());
		}
		return ergebnis;
	}
}
