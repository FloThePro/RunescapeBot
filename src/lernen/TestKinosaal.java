package lernen;

public class TestKinosaal {
	public static void main(String[] args) {
		Kinosaal kino = new Kinosaal();
		Kinosaal kono = new Kinosaal();

		kino.setAnzahlSitzplaetzeSaal(50);
		kono.setAnzahlSitzplaetzeSaal(100);

		System.out.println("Anzahl Sitzpl�tze im Kino: " + Kinosaal.getAnzahlSitzplaetzeKino());
		System.out.println("Anzahl Kinos: " + Kinosaal.getAnzahlKinosaele());
		System.out.println("Anzahl Sitzpl�tze in Kino 1: " + kino.getAnzahlSitzplaetzeSaal());
		System.out.println("Anzahl Sitzpl�tze in Kino 2: " + kono.getAnzahlSitzplaetzeSaal());
		kino.setAnzahlSitzplaetzeSaal(70);
		System.out.println("Anzahl Pl�tze Kino 1: " + kino.getAnzahlSitzplaetzeSaal());
		System.out.println("Anzahl Sitzpl�tze im Kino: " + Kinosaal.getAnzahlSitzplaetzeKino());
	}
}
