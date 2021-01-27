/*
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
 */
package by.epam.jo_01_03_08.bean;

import static java.lang.System.*;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Integer digit1 = 0;
		Integer digit2 = 0;	
		String str = "";
		int number1 = 0;
		int number2 = 0;
		int temp = 0;
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите первое число ");
		number1 = scanner.nextInt();

		System.out.print("Введите первое число ");
		number2 = scanner.nextInt();

		scanner.close();	
		temp = number2;

		do {
			digit1 = number1 % 10;

			number2 = temp;

			do {

				digit2 = number2 % 10;

				if (digit1 == digit2) {

					str += digit1;

				}

				number2 /= 10;

			} while (number2 > 0);

			number1 /= 10;

		} while (number1 > 0);

		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length - 1; i++) {

			int j = i + 1;

			for (; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					arr[j] = '*';

				}

			}

		}
		
		out.print("Цифры, входящие в запись как первого так и второго числа: ");

		if(arr.length < 1) {
			out.print("отсутсвуют");
		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != '*') {
				out.print(arr[i] + " ");
			}
		}
		out.print("\n");

	}

}
