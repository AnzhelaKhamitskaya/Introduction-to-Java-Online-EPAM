/*
 * Даны два угла треугольника (в градусах). 
 * Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */
package by.epam.jo_01_02_01;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		final double sumAnglesTriangle = 180;

		double x = 0;
		double y = 0;
		boolean flag = false;
		Scanner scanner;

		do {

			flag = true;

			System.out.print("Введите первый угол треугольника ");

			scanner = new Scanner(System.in);

			if (scanner.hasNextDouble()) {

				x = scanner.nextDouble();

				if (x > 0) {

					do {
						
						flag = true;

						System.out.print("Введите второй угол треугольника ");

						scanner = new Scanner(System.in);

						if (scanner.hasNextDouble()) {

							y = scanner.nextDouble();

							if (y > 0) {

								if ((x + y) >= sumAnglesTriangle) {

									System.out.println("Треугольник с заданными углами НЕ существует");

								} else if ((x + y) == 90 || x == 90 || y == 90) {

									System.out.println("Треугольник является прямоугольным");

								} else {

									System.out.println("Треугольник НЕ является прямоугольным");

								}

							} else {

								flag = false;

								System.out.println("Введите число больше нуля!");

							}

						} else {

							flag = false;

							System.out.println("Неверный формат данных!");

						}

					} while (!flag);

				} else {

					flag = false;

					System.out.println("Введите число больше нуля!");

				}

			} else {

				flag = false;

				System.out.println("Неверный формат данных!");
			}

		} while (!flag);

		scanner.close();
	}

}
