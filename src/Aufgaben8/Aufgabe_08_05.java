package Aufgaben8;


class Aufgabe_08_05 {

	public static void main(String[] args) {
		
		Pinguin pi = new Pinguin(true, 100, "Herbert");
		Zebra zeb = new Zebra(99, 33, "Rudi");
		// Zebra und Pinguin erzeugen

		polymorpheMethode(zeb);
		polymorpheMethode(pi);
		// polymorphe Methode aufrufen
		
	}
	
	public static void polymorpheMethode(ZooTier t){
		System.out.println("Gewicht: " + t.gewicht);
		
		System.out.println("Name: " + t.name);
		// Ausgabe von Name und Gewicht
		if (t instanceof Pinguin) {
			System.out.println("Ist der Pinguin König? " + ((Pinguin) t).getIstKoenig());
		}else {
			System.out.println("Anzahl Streifen: " + ((Zebra) t).getAnzahlStreifen());
		}
	}

}

