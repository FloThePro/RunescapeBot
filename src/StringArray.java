
public class StringArray {

	public static void main(String[] args) {
		String[] array = new String[3];
		array[0] = "Guenther";
		array[1] = "Flo";
		array[2] = "Werner";
		array[0] = array[0].substring(0,1) + ".";
		System.out.println(array[0]);
		
		System.out.println(array[1].length());
		
		System.out.println(array[2].toUpperCase());
	}
}