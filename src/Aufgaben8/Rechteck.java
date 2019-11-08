package Aufgaben8;

public class Rechteck extends GeometrischeFigur{

	double grundlinie, hoehe, umfang, flaeche;
	
	public Rechteck(double grundlinie, double hoehe) {
		this.grundlinie = grundlinie;
		this.hoehe = hoehe;
	}
	
	public double berechneUmfang() {
		umfang = (2 * grundlinie) + 2 * hoehe;
		
		return umfang;
	}
	
	public double berechneFlaeche() {
		flaeche = grundlinie * hoehe;
		
		return flaeche;
	}
}
