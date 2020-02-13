package by.ld.unit01.main;

public class Task013 {

	public static void main(String[] args) {
		double x1 = 1;
		double y1 = 1;
		double x2 = 2;
		double y2 = 5;
		double x3 = 5;
		double y3 = 3;
		double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		double b = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
		double c = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
		double p = (a + b + c) / 2;
		System.out.println("Площадь треугольника равна " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));

	}

}
