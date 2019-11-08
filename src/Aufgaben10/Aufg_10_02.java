package Aufgaben10;

import java.util.Date;

import java.text.DateFormat;
import java.text.ParseException;

public class Aufg_10_02 {
	public static Date pruefeDatum(String datum) throws ParseException {

		// Eine auf die Rechnerlokation abgestimmte Instanz der Klasse
		// DateFormat wird erzeugt.
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);

		// strenge Datumspruefung einschalten
		df.setLenient(false);

		// Datum Ueberpruefen und in ein Date-Objekt wandeln.
		// Die Methode parse() wirft eine ParseException, wenn in
		// datum kein gueltiges Datum steht.
		// Wichtig: Ob ein String als Datum eingegeben werden kann,
		// hängt auch vom verwendeten Locale ab!
		Date d = df.parse(datum);
		return d;
	}
	
	public static void main(String[] args) {
		String testDate = "16.01.2019";
		Date date = null;
		try {
			date = pruefeDatum(testDate);
			System.out.println("Dieses Datum ist ok: " + date);
		}catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
