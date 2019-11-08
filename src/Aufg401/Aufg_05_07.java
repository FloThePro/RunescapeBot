package Aufg401;

public class Aufg_05_07 {
	int ergebnis = 1;

	public int berechnen(int n) {

		for (int i = 1; i < (n + 1); i++) {
			ergebnis = i * ergebnis;
		}

		return ergebnis;
	}
}
