package Aufgaben8;

import Aufg401.Tools;

public class Fahrzeug {

	protected double preis;
	protected String herstellerName;
	protected String farbe;

	public Fahrzeug(String farbe) {

		this.farbe = farbe;

		System.out.print("\nGeben Sie den Herstellernamen ein: \n");
		herstellerName = Tools.stringEingabe();

		System.out.print("Geben Sie den Preis ein: \n");
		preis = Tools.doubleEingabe();

	}

	public void print() {

		System.out.println();
		System.out.println("Herstellername   : " + herstellerName);
		System.out.println("Preis            : " + preis);
		System.out.println("Farbe\t   :" + farbe);
	}

}
