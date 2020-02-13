package by.ld.unit01.main;

public class Task012 {

	public static void main(String[] args) {
		double x1 = 1;
		double y1 = 1;
		double x2 = 7;
		double y2 = 4;
		double kat1 = Math.abs(x1 - x2);
		double kat2 = Math.abs(y1 - y2);
		System.out.println("Расстояние между точками равно " + Math.sqrt(kat1 * kat1 + kat2 * kat2));
	}

}
