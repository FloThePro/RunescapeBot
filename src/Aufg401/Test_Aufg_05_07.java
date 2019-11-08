package Aufg401;

public class Test_Aufg_05_07 {
	public static void main(String[] args) {
		Aufg_05_07 funk = new Aufg_05_07();
		int wert;
		System.out.println("Geben Sie eine Ganzzahl ein.");
		wert = Tools.intEingabe();

		System.out.println("Das Ergebnis ist: " + funk.berechnen(wert));

	}
}
