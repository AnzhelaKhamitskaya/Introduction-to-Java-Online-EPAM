/*
 * Вычислить значения функции на отрезке [а,b] c шагом h
 */

package by.epam.jo_01_03_02.bean;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		double y = 0;
		double x = 0;
		double a = 0;
		double b = 0;
		double h = 0;
		boolean flag = false;
		Scanner scanner;

		do {

			flag = true;

			System.out.print("Введите, пожалуйста, значение а на отрезке [a,b] ");
			scanner = new Scanner(System.in);

			if (scanner.hasNextDouble()) {

				a = scanner.nextDouble();

			} else {

				flag = false;
				System.out.println("Неверный формат! ");

			}

		} while (!flag);

		do {

			flag = true;
			System.out.print("Введите, пожалуйста, значение b на отрезке [a,b] ");

			scanner = new Scanner(System.in);

			if (scanner.hasNextDouble()) {

				b = scanner.nextDouble();

			} else {

				flag = false;
				System.out.println("Неверный формат! ");

			}

		} while (!flag);

		do {

			flag = true;
			System.out.print("Введите, пожалуйста, значение h (шаг) на отрезке [a,b] ");

			scanner = new Scanner(System.in);
			if (scanner.hasNextDouble()) {

				h = scanner.nextDouble();

				if (h == 0) {

					flag = false;
					System.out.println("Шаг не должен равняться 0!");
				}

			} else {

				flag = false;
				System.out.println("Неверный формат! ");

			}

		} while (!flag);

		do {

			flag = true;

			System.out.print("Введите, пожалуйста, значение переменной x функции ");
			scanner = new Scanner(System.in);

			if (scanner.hasNextDouble()) {

				x = scanner.nextDouble();

			} else {

				flag = false;
				System.out.println("Неверный формат! ");

			}

		} while (!flag);
		
		scanner.close();

		for (x = a; x <= b; x += h) {

			if (x == 0 || x > 2) {
				
				y = x;
				
			} else if (x <= 2) {

				y = -x;

			} 

			System.out.println("Значения функции на отрезке [" + a + "," + b + "] c шагом " + h + " равно " + y);
		}

	}

}
