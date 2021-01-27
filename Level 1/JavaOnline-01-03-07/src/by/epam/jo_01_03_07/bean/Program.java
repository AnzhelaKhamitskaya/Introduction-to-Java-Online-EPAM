/*
 * ƒл€ каждого натурального числа в промежутке от m до n вывести все делители, 
 * кроме единицы и самого числа. 
 * m и n ввод€тс€ с клавиатуры
 */

package by.epam.jo_01_03_07.bean;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("¬ведите натуральное число m промежутка [m,n] ");
		int m = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("¬ведите натуральное число n промежутка [m,n] ");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = m; i <= n; i++) {

			if (i % 2 == 0) {

				System.out.print("ƒелители " + i + "(кроме 1 и самого себ€): ");

				for (int y = 2; y <= i / 2; y++) {
					
					if (i % y == 0) {
						System.out.print(y + " ");
					}
		
				}

			} else {
				
				System.out.println("\n" + i + " €вл€етс€ простым числом");
				
			}

		}

		scanner.close();
		System.out.println("\n");
	}

}
