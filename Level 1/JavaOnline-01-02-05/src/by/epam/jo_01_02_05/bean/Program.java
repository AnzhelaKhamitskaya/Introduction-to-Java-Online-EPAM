/*
 * Вычислить значение функции 
 */

package by.epam.jo_01_02_05.bean;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		double x = 0;
		double f = 0;
		boolean flag = false;
		Scanner scanner;
		
		do {
			flag = true;

			scanner = new Scanner(System.in);

			System.out.print("Введите значение x ");

			if (scanner.hasNextDouble()) {

				x = scanner.nextDouble();

				if (x <= 3) {

					f = Math.pow(x, 2) - 3 * x + 9;

				} else {

					f = 1 / (Math.pow(x, 3) + 6);

				}

				System.out.printf("Значение функции равно %f %n", f);

			} else {

				flag = false;
				System.out.println("Неверный формат!");

			}

		} while (!flag);

		scanner.close();
	}

}
