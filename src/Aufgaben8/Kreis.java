package Aufgaben8;

public class Kreis extends GeometrischeFigur{

	double radius, umfang, flaeche;
	
	public Kreis(int radius) {
		this.radius = radius;
	}
	
	public double berechneUmfang() {
		umfang = 2 * Math.PI * radius;
		
		return umfang;
	}
	
	public double berechneFlaeche() {
		flaeche = Math.PI * radius * radius;
		
		return flaeche;
	}
}
