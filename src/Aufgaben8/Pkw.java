package Aufgaben8;

import Aufg401.Tools;

public class Pkw extends Fahrzeug {

	private String modellBezeichnung;

	public Pkw() {

		super("gruen");

		System.out.print("Geben Sie die Modellbezeichnung ein: ");
		modellBezeichnung = Tools.stringEingabe();
	}

	public void print() {

		super.print();
		System.out.println("Modellbezeichnung: " + modellBezeichnung);
	}
}
