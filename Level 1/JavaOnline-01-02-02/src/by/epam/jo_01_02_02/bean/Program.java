/*
 * Найти max{min(a, b), min(c, d)} 
 */

package by.epam.jo_01_02_02.bean;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		double a = 0;
		double b = 0;
		double minAB = 0;
		;
		double c = 0;
		double d = 0;
		double minCD = 0;
		boolean flag = false;
		Scanner scanner;

		do {
			flag = true;

			scanner = new Scanner(System.in);

			System.out.print("Введите значение а ");

			if (scanner.hasNextDouble()) {

				a = scanner.nextDouble();
				scanner.nextLine();

			} else {

				flag = false;
				System.out.println("Неверный формат!");

			}

		} while (!flag);

		do {
			flag = true;

			scanner = new Scanner(System.in);

			System.out.print("Введите значение b ");

			if (scanner.hasNextDouble()) {

				b = scanner.nextDouble();
				scanner.nextLine();

			} else {

				flag = false;
				System.out.println("Неверный формат!");

			}

		} while (!flag);

		do {
			flag = true;

			scanner = new Scanner(System.in);

			System.out.print("Введите значение c ");

			if (scanner.hasNextDouble()) {

				c = scanner.nextDouble();
				scanner.nextLine();

			} else {

				flag = false;
				System.out.println("Неверный формат!");

			}

		} while (!flag);

		do {
			flag = true;

			scanner = new Scanner(System.in);
			
			System.out.print("Введите значение d ");

			if (scanner.hasNextDouble()) {

				d = scanner.nextDouble();
				scanner.nextLine();
			} else {

				flag = false;
				System.out.println("Неверный формат!");

			}

		} while (!flag);

		if (b < a) {

			minAB = b;

		} else {

			minAB = a;
		}

		if (d < c) {

			minCD = d;

		} else {

			minCD = c;
		}

		scanner.close();
		System.out.println(Math.max(minAB, minCD));
	}

}
