package Aufg401;

public class Aufg_06_02 {

	private int wert = 7;
	public int zugriff() {
		int tmp = wert;
		int wert = 77;
		return tmp;
		
	}
	
	public static void main (String [] args) {
		Aufg_06_02 funk = new Aufg_06_02();
		System.out.println(funk.zugriff());
	}
}
