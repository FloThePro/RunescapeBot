package Aufg401;


public class BierTest {

	
	public static void main(String[] args) {
		
		Aufg_07_05 bf1 = new Aufg_07_05("Pils", 80);
		Aufg_07_05 bf2 = new Aufg_07_05("Alt", 100);
		Aufg_07_05 bf3 = new Aufg_07_05("Kölsch", 50);

		bf1.print();
		bf2.print();
		bf3.print();
		System.out.println("Anzahl.Fässer: "+Aufg_07_05.getAnzahlFaesser());
		System.out.println("Liter insgesamt: "+Aufg_07_05.getLiterGesamt());
		System.out.println("---------------------------------------------");
		
		bf1.zapfen(20);
		bf2.zapfen(10);
		bf3.zapfen(50);
		
		bf1.print();
		bf2.print();
		bf3.print();
		System.out.println("Anzahl.Fässer: "+Aufg_07_05.getAnzahlFaesser());
		System.out.println("Liter insgesamt: "+Aufg_07_05.getLiterGesamt());
		
	}

}
