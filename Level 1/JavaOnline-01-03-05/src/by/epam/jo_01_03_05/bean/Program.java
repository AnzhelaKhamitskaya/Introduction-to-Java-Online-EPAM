/*
 * Даны числовой ряд и некоторое число е. 
 * Найти сумму 
 * тех членов ряда, 
 * модуль которых 
 * больше или равен заданному е
 */

package by.epam.jo_01_03_05.bean;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		double e = 0;
		double sum = 0;
		Scanner scanner;
		
		System.out.print("Ведите некоторое число ");

		scanner = new Scanner(System.in);
		e = scanner.nextDouble();
		scanner.close();
		
		if (e <= 0) {

			System.out.println("Сумма бесконечно велика ");

		} else {
			
			int i = 0;
			
			while(Math.abs(1.0 / Math.pow(2, i) + 1.0 / Math.pow(3, i)) >= e) {
				
				sum += Math.abs(1.0 / Math.pow(2, i) + 1.0 / Math.pow(3, i));
				i++;
			}
			
			
			if(sum > 0) {
				
				System.out.printf("Сумма равна %f", sum);
				
			}else {
				
				System.out.printf("Нет таких членов");
				
			}
		}
	}
}
