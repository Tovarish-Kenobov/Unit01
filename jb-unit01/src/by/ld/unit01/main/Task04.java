package by.ld.unit01.main;

import java.util.*;

public class Task04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Катет 1: ");
		double kat1 = scanner.nextDouble();
		System.out.print("Катет 2: ");
		double kat2 = scanner.nextDouble();
		System.out.println("Гипотенуза равна " + (Math.sqrt(kat1 * kat1 + kat2 * kat2)));
		System.out.println("Площадь равна " + (kat1 * kat2 / 2));

	}

}
