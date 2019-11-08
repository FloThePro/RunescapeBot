package Aufgaben10;


public class Bankkonto {

	private double kontostand = 0;

	public void einzahlen(double betrag) throws TransaktionsException {
		if (betrag <= 0) {
			throw new TransaktionsException("Fehler! negativer Einzahlungsbetrag!");
		}else {
			kontostand = kontostand + betrag;
		}

	}

	public void auszahlen(double betrag) throws TransaktionsException{
		if (betrag <= 0) {
			throw new TransaktionsException("Fehler! Negativer Betrag!");
		}else if(kontostand < betrag) {
			throw new TransaktionsException("Depp du bist schon wieder pleite, Alter");
		}
		kontostand = kontostand - betrag;
	}

	public double getKontostand() {
		return kontostand;
	}
}
