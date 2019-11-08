package Aufgaben8;

import Aufg401.Tools;

public class Motorrad extends Fahrzeug {

	private int spassFaktor;

	public Motorrad() {
		
		super("gelb");

		System.out.print("Geben Sie den Spaﬂfaktor ein: ");
		spassFaktor = Tools.intEingabe();
	}

	public void print() {
		
		super.print();
		System.out.println("Spaﬂfaktor: " + spassFaktor);
	}
}
