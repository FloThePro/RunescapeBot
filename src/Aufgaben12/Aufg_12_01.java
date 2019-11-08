/**
 * 
 * @author Florian
 * @version 0.1
 * 
 */
package Aufgaben12;

import java.util.*;

public class Aufg_12_01 {
	
	private String stadtname;
	private double temperatur;

	
	public static void main(String[] args) {

		HashMap<String, Double> myHashMap = new HashMap<String, Double>();
		myHashMap.put("München", 21.50);
		myHashMap.put("Hamburg", 31.30);
		myHashMap.put("Hannover", 12.31);
		
		System.out.println("München: " + myHashMap.get("München"));
		System.out.println("Hamburg: " + myHashMap.get("Hamburg"));
		System.out.println("Hannover: " + myHashMap.get("Hannover"));
		
		for(String stadt : myHashMap.keySet()) {
			System.out.println(stadt + ": " + myHashMap.get(stadt));
		}
	}
}
