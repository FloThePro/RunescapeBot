package Aufg401;

public class AuftragMain {

	public static void main(String[] args) {
		
		Aufg_07_06[] aufArray = new Aufg_07_06[5];
		
		aufArray[0] = new Aufg_07_06("Klimaanlage reparieren", "Dr. Müller", 3);
		aufArray[1] = new Aufg_07_06("Glühbirne wechseln", "Frau Trulla", 2);
		aufArray[2] = new Aufg_07_06("Kartenautomat updaten", "Herr Hilbert");
		aufArray[3] = new Aufg_07_06("Klospülung reparieren", "Peter Puller");
		aufArray[4] = new Aufg_07_06("Alarmanlage einbauen", "Chef", 1);
		
		for (Aufg_07_06 aufg_07_06 : aufArray) {
			
		}
		
		// Array durchlaufen (z.B. mit for each-Schleife), dann
		// alle Aufträge mit Priorität 1 ausgeben
		

	}

}
