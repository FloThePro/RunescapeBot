
public class StringBufferUebung {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Super Java!");
		StringBuffer s2 = new StringBuffer("30");
		StringBuffer s3 = s1;
		System.out.println("S3 hat den Wert: " + s3);
		int summe = 20 + Integer.parseInt(s2.toString());
		System.out.println("Die Summe ist: " + summe);

		s2.append(" Grad warmes Wasser");
		s3 = s2;
		System.out.println("Sb3 aktualisiert: " + s3);
	}

}