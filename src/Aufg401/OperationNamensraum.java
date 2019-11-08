package Aufg401;

public class OperationNamensraum {
	public static void main(String[] args) {
		Quadrat quad = new Quadrat();
		quad.setSeitenlaenge(5);
		Kreis kreis = new Kreis();
		kreis.setRadius(5);

		// Flaecheninhalt des Quadrats
		System.out.println("Flaecheninhalt des Quadrats: " + quad.berechneFlaeche());

		// Flaecheninhalt des Kreises
		System.out.println("Flaecheninhalt des Kreises: " + kreis.berechneFlaeche());
	}
}

class Quadrat {
	private double seitenlaenge;

	public void setSeitenlaenge(double seitenlaenge) {
		this.seitenlaenge = seitenlaenge;
	}

	public double berechneFlaeche() {

		return seitenlaenge * 2;
	}
}

class Kreis {
	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double berechneFlaeche() {
		return 3.141592658 * radius * radius;
	}
}
