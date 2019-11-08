package Aufgaben10;

public class TransaktionsException extends Exception {

	public TransaktionsException() {
		
		super("Fehler! Der eingegebene Wert ist unzulässig!");
	}

	public TransaktionsException(String message) {
		super(message);
	}
}
