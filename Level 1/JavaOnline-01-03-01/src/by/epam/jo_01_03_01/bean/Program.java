/*
 * Напишите программу, где пользователь вводит любое целое положительное число. 
 * А программа суммирует все числа от 1 до введенного пользователем числа
 */

package by.epam.jo_01_03_01.bean;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int number = -1;
		int sumNumbers = 0;
		int counter = 0;
		boolean flag;
		Scanner scanner;
		
		System.out.print("Введите, пожалуйста, целое положительное число ");

		do {
			
			flag = true;
			scanner = new Scanner(System.in);
			
			if (scanner.hasNextInt()) {

				number = scanner.nextInt();			
				
				if (number <= 0) {

					flag = false;
					System.out.print("Введите целое положительное число! ");

				} else {
					scanner.close();
					
					for (; counter <= number; counter++) {

						sumNumbers += counter;
						
						if(sumNumbers < 0) {
							System.out.println("Слишком большое число!");
							break;
						}

					}
					if(sumNumbers > 0) {
						System.out.println("Сумма чисел от от 1 до " + number + " равна " + sumNumbers);
					}
				}

			} else {

				flag = false;
				System.out.print("Введите целое положительное число! ");

			}

		} while (!flag);

	}

}
