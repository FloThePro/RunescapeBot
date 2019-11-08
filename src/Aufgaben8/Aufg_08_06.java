package Aufgaben8;

public class Aufg_08_06{
	public static void main(String[] args) {
		Elefant e1 = new Elefant(3, 99, 3, 1);
		Giraffe g1 = new Giraffe(80, 2, 33, 50);
		ausgabeTier(e1);
		ausgabeTier(g1);
	}

	private static void ausgabeTier(Tier t) {
		if (t instanceof Elefant) {
			System.out.println("Dieser Elefant wiegt " + t.getGewicht() + " Kilogramm.");
			System.out.println("Er ist " + t.getGroesse() + " Meter groß.");
			System.out.println("Seine ID ist: "  + t.getId());
			System.out.println("Sein Rüssel ist: " + ((Elefant) t).getRuessellaenge() + " Meter lang.\n\n");
		}else {
			System.out.println("Diese Giraffe wiegt " + t.getGewicht() + " Kilogramm.");
			System.out.println("Sie ist " + t.getGroesse() + " Meter groß.");
			System.out.println("Ihre ID ist: "  + t.getId());
			System.out.println("Ihr Hals ist: " + ((Giraffe) t).getHalslaenge() + " Meter lang.\n\n");
		}
		
	}
}