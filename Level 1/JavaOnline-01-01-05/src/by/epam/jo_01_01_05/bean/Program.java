/*
 * Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
 * Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.
 */

package by.epam.jo_01_01_05.bean;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int time = 0;
		int h = 0;
		int min = 0;
		int sec = 0;
		boolean flag = false;
		Scanner scanner;

		do {

			flag = true;

			System.out.print("Введите количество секунд ");

			scanner = new Scanner(System.in);

			if (scanner.hasNextInt()) {

				time = scanner.nextInt();
				scanner.nextLine();

				if (time >= 0) {

					h = time / 3600;
					min = time % 3600 / 60;
					sec = time % 3600 % 60;

					System.out.format("%02dч %02dмин %02dс%n", h, min, sec);
					//System.out.format("%02dмин ", min);
					//System.out.format("%02dс%n", sec);

				} else {

					flag = false;
					System.out.println("Ведите положительное число!");
				}

			} else {

				flag = false;
				System.out.println("Введите целое число!");
			}

		} while (flag == false);

		scanner.close();
	}

}
