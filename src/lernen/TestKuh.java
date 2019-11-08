package lernen;

public class TestKuh {
	public static void main(String[] args) {
		Kuh k1 = new Kuh();
		Kuh k2 = new Kuh();
		Käfer k3 = new Käfer();

		k3.punkte = 3;
		k1.name = "Berta";
		k2 = k1;
		Kuh.anzahl = 1;
		Kuh.anzahl = 2;
		
		System.out.println("Der Name von k1 ist: " + k1.name);
		System.out.println("Der Name von k2 ist: " + k2.name);
		System.out.println("Anzahl Kühe: " + Kuh.anzahl);
		System.out.println(k3.punkte);
	}
}
