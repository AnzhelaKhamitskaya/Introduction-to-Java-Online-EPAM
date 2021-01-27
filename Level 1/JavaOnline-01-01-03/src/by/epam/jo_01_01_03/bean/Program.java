/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения): 
 * (𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦) / (𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦) ∗ 𝑡𝑔 𝑥𝑦
 */

package by.epam.jo_01_01_03.bean;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		double x = 0;
		double y = 0;
		double z2 = 0;
		boolean flag2;
		Scanner scanner;
		
		System.out.println("Выражение: z = (𝑠𝑖𝑛 𝑥 + 𝑐𝑜𝑠 𝑦) / (𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦) ∗ 𝑡𝑔 𝑥𝑦");

		do {
			flag2 = true;

			System.out.print("Введите значение x ");

			scanner = new Scanner(System.in);

			if (scanner.hasNextDouble()) {
				
				x = scanner.nextDouble();
				scanner.nextLine();
				
			} else {
				
				System.out.println("Неверный формат введенных данных!");
				flag2 = false;

			}
			
		} while (flag2 == false);

		do {
			flag2 = true;

			System.out.print("Введите значение y ");

			scanner = new Scanner(System.in);

			if (scanner.hasNextDouble()) {
				
				y = scanner.nextDouble();
				scanner.nextLine();

				
			} else {
				
				System.out.println("Неверный формат введенных данных!");
				flag2 = false;
				
			}
		} while (flag2 == false);

		scanner.close();
		
		z2 = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) - Math.tan(x * y);

		if ((z2 - z2) != (z2 - z2)) {
			
			System.out.println("Значение выражения z невозможно вычислить. Деление на ноль!");
			
		} else {
			
			System.out.printf("Значение выражения z равно %.2f %n", z2);
		}

	}

}
