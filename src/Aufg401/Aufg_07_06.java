package Aufg401;

public class Aufg_07_06 {

	String titel, auftragGeber;
	int prioritaet;

	public Aufg_07_06(String titel, String auftragGeber, int prioritaet) {
		this.titel = titel;
		this.auftragGeber = auftragGeber;
		this.prioritaet = prioritaet;
	}

	public Aufg_07_06(String titel, String auftragGeber) {
		this(titel, auftragGeber, 3);
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getAuftragGeber() {
		return auftragGeber;
	}

	public void setAuftragGeber(String auftragGeber) {
		this.auftragGeber = auftragGeber;
	}

	public int getPrioritaet() {
		return prioritaet;
	}

	public void setPrioritaet(int prioritaet) {
		this.prioritaet = prioritaet;
	}

}
