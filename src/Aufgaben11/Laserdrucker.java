package Aufgaben11;

public class Laserdrucker implements Drucker, Cloneable {

	private int seiten;

	public Laserdrucker() {
		this.seiten = 100;
	}

	public void drucke(String s) {
		System.out.println(s);
		seiten--;
	}

	public int getSeiten() {
		return seiten;
	}

	public Laserdrucker clone() throws CloneNotSupportedException {
		return (Laserdrucker) super.clone();
	}

}
