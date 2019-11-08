package Aufg401;

public class Aufg_07_04_Test {
	public static void main(String[] args) {

		Aufg_07_04 teamArray[] = new Aufg_07_04[5];

		teamArray[0] = new Aufg_07_04("VFB Stuttgart", 50, 18);
		teamArray[1] = new Aufg_07_04("Borussia Mönchengladbach", 56, 22);
		teamArray[2] = new Aufg_07_04("Herne West", 58, 25);
		teamArray[3] = new Aufg_07_04("FC Bayern München", 67, 50);
		teamArray[4] = new Aufg_07_04("Borussia Dortmund", 75, 48);

		Aufg_07_04 meister = teamArray[0];

		for (Aufg_07_04 aktuell : teamArray) {

			if (aktuell.getPunkte() > meister.getPunkte()) {
				meister = aktuell;

			} else if (aktuell.getPunkte() == meister.getPunkte()) {
				if (aktuell.getTordifferenz() > meister.getTordifferenz())
					meister = aktuell;
			}
		}

		System.out.println("Punkte insgesamt: " + Aufg_07_04.getPunkteGesamt());
		System.out.println("----------------------------");
		System.out.println("Deutscher Meister ist:");
		System.out.println(meister.getVerein());
		System.out.println("mit " + meister.getPunkte() + " Punkten");
		System.out.println("und einer Tordifferenz von " + meister.getTordifferenz());

	}
}