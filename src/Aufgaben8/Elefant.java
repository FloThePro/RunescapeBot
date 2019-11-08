package Aufgaben8;

public class Elefant extends Tier{

	private int ruessellaenge;
	
	public Elefant(int ruessellaenge, int gewicht, int groesse, int id) {
		super(id, groesse, gewicht);
		this.ruessellaenge = ruessellaenge;
	}
	
	public int getRuessellaenge() {
		return ruessellaenge;
	}
}
