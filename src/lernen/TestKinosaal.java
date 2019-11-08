package lernen;

public class TestKinosaal {
	public static void main(String[] args) {
		Kinosaal kino = new Kinosaal();
		Kinosaal kono = new Kinosaal();

		kino.setAnzahlSitzplaetzeSaal(50);
		kono.setAnzahlSitzplaetzeSaal(100);

		System.out.println("Anzahl Sitzplätze im Kino: " + Kinosaal.getAnzahlSitzplaetzeKino());
		System.out.println("Anzahl Kinos: " + Kinosaal.getAnzahlKinosaele());
		System.out.println("Anzahl Sitzplätze in Kino 1: " + kino.getAnzahlSitzplaetzeSaal());
		System.out.println("Anzahl Sitzplätze in Kino 2: " + kono.getAnzahlSitzplaetzeSaal());
		kino.setAnzahlSitzplaetzeSaal(70);
		System.out.println("Anzahl Plätze Kino 1: " + kino.getAnzahlSitzplaetzeSaal());
		System.out.println("Anzahl Sitzplätze im Kino: " + Kinosaal.getAnzahlSitzplaetzeKino());
	}
}
