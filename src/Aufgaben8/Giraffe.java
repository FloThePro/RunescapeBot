package Aufgaben8;

public class Giraffe extends Tier{
	
	private int halslaenge;
	
	public Giraffe(int gewicht, int id, int groesse, int halslaenge) {
		super(id, groesse, gewicht);
		this.halslaenge = halslaenge;
	}
	
	public int getHalslaenge() {
		return halslaenge;
	}

}
