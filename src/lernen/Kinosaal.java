package lernen;

public class Kinosaal {

	private int saalNummer, anzahlSitzplaetzeSaal, hilf;
	private static int anzahlSitzplaetzeKino, anzahlKinosaele;
	
	public Kinosaal() {
		anzahlKinosaele++;
		saalNummer = anzahlKinosaele;
	}
	public void setAnzahlSitzplaetzeSaal(int anzahl) {
		hilf = anzahlSitzplaetzeSaal;
		this.anzahlSitzplaetzeSaal = anzahl;
		if(anzahlSitzplaetzeSaal != 0) {
			if (hilf >= anzahl) {
				anzahlSitzplaetzeKino = anzahlSitzplaetzeKino + (anzahl - hilf);
			}else {
				anzahlSitzplaetzeKino = anzahlSitzplaetzeKino - (hilf - anzahl);
			}
		}else {
			anzahlSitzplaetzeKino = anzahlSitzplaetzeKino + anzahlSitzplaetzeSaal;
			
		}
		
		
	}
	public int getAnzahlSitzplaetzeSaal() {
		return anzahlSitzplaetzeSaal;
	}
	public static int getAnzahlSitzplaetzeKino() {
		return anzahlSitzplaetzeKino;
	}
	public static int getAnzahlKinosaele() {
		return anzahlKinosaele;
	}
	
}
