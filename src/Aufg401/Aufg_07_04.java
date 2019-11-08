package Aufg401;
public class Aufg_07_04 {
	
	String verein;
	int punkte, tordifferenz;
	private static int punkteGesamt = 0;
	
	public Aufg_07_04(String verein, int punkte, int tordifferenz) {
		this.verein = verein;
		this.punkte = punkte;
		this.tordifferenz = tordifferenz;
		punkteGesamt+=punkte;
	}
	public static void main(String[] args) {
		Aufg_07_04 [] teams = new Aufg_07_04[5];
		
		teams[0] = new Aufg_07_04("FcBayern", 11, 12);
		teams[1] = new Aufg_07_04("Leipzig", 13, 10);
		teams[2] = new Aufg_07_04("Dortmund", 10, 8);
		teams[3] = new Aufg_07_04("Freiburg", 10, 7);
		teams[4] = new Aufg_07_04("Schalke", 10, 5);
	}

	public static int getPunkteGesamt() {
		
		return punkteGesamt;
	}

	public String getVerein() {
		return verein;
	}

	public int getPunkte() {
		return punkte;
	}

	public int getTordifferenz() {
		return tordifferenz;
	}
	
}
