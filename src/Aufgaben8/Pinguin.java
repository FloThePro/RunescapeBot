package Aufgaben8;

public class Pinguin extends ZooTier{

	private boolean istKoenig;
	
	public Pinguin(boolean istKoenig, int gewicht, String name) {
		this.istKoenig = istKoenig;
		super.name = name;
		super.gewicht = gewicht;
	}
	
	public boolean getIstKoenig() {
		return istKoenig;
	}
}
