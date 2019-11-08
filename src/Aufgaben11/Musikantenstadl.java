package Aufgaben11;

public class Musikantenstadl {

	public static void main(String[] args) {
		Trommel trommel1 = new Trommel();
		Trommel trommel2 = new Trommel();
		Trommel trommel3 = new Trommel();
		Trompete trompete1 = new Trompete();
		Trompete trompete2 = new Trompete();
		Trompete trompete3 = new Trompete();
		
		for (int i = 0; i < 5; i++) {
			trommel1.spieleInstrument();
			trompete1.spieleInstrument();
			trommel2.spieleInstrument();
			trompete2.spieleInstrument();
			trommel3.spieleInstrument();
			trompete3.spieleInstrument();
		}
		
	}
}
