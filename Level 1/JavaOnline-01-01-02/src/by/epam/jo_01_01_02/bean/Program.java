/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения): 
 * (𝑏 + √𝑏2 + 4𝑎𝑐 )/2𝑎 - 𝑎3𝑐 + 𝑏−2
 */

package by.epam.jo_01_01_02.bean;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		double a1 = 0;
		double b1 = 0;
		double c1 = 0;
		double z1 = 0;
		boolean flag = false;
		Scanner scanner;
		
		System.out.println("Выражение: z = ((𝑏 + √𝑏2 + 4𝑎𝑐 )/2𝑎) - 𝑎3𝑐 + 𝑏−2");

		do {
			flag = true;

			System.out.print("Введите значение а ");

			scanner = new Scanner(System.in);

			if (scanner.hasNextDouble()) {

				a1 = scanner.nextDouble();
				scanner.nextLine();

			} else {

				System.out.println("Неверный формат введенных данных!");
				flag = false;

			}

		} while (flag == false);
		

		do {
			flag = true;

			System.out.print("Введите значение b ");

			scanner = new Scanner(System.in);

			if (scanner.hasNextDouble()) {

				b1 = scanner.nextDouble();
				scanner.nextLine();

			} else {

				System.out.println("Неверный формат введенных данных!");
				flag = false;

			}

		} while (flag == false);

		do {

			flag = true;

			System.out.print("Введите значение c ");

			scanner = new Scanner(System.in);

			if (scanner.hasNextDouble()) {

				c1 = scanner.nextDouble();
				 scanner.nextLine();

			} else {

				System.out.println("Неверный формат введенных данных!");
				flag = false;
			}

		} while (flag == false);

		scanner.close();
		
		z1 = ((b1 + Math.sqrt(Math.pow(b1, 2) + 4 * a1 * c1)) / (2 * a1)) - Math.pow(a1, 3) * c1 + Math.pow(b1, -2);

		if ((z1 - z1) != (z1 - z1)) {

			System.out.println("Значение выражения z невозможно вычислить. Деление на ноль!");

		} else {

			System.out.printf("Значение выражения z равно %.2f %n", z1);
		}

	}

}
