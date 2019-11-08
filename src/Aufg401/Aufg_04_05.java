package Aufg401;

public class Aufg_04_05 {
	public static void main(String[] args) {
		int sekunden = 0, minuten = 0, stunden = 0, tage = 0;
		tage = Tools.intEingabe();
		// Berechnungen mit arithmetischen Operatoren
		// ...
		stunden = tage * 24;
		minuten = tage * (24 * 60);
		sekunden = tage * (24 * 60 * 60);

		System.out.println("Das sind");
		System.out.println(stunden + " Stunden oder");
		System.out.println(minuten + " Minuten oder");
		System.out.println(sekunden + " Sekunden");
	}
}
