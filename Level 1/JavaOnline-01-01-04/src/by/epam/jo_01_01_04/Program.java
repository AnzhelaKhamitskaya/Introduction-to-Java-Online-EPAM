/*
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */
package by.epam.jo_01_01_04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		double number = 0;
		double newNumber = 0;
		// double rest = 0;
		int wholePart = 0;
		int newWholePart = 0;
		double fractionalPart = 0;
		double newfractionalPart = 0;
		boolean flag = false;
		Scanner scanner;

		do {
			flag = true;
			System.out.print("Введите число в формате nnn,ddd ");

			scanner = new Scanner(System.in);

			if (scanner.hasNextDouble()) {

				number = scanner.nextDouble();
				System.out.println(number);

				wholePart = (int) number;
				System.out.println(wholePart);

				fractionalPart = number % wholePart;
				System.out.println(fractionalPart);

				newfractionalPart = wholePart / 1000.00;
				System.out.println(newfractionalPart);

				newWholePart = (int)Math.round(fractionalPart * 1000);
				System.out.println(newWholePart);

				newNumber = newWholePart + newfractionalPart;
				System.out.println( new DecimalFormat("000.000").format(newNumber));
				
			} else {

				flag = false;
				System.out.println("Неверный формат числа!");
			}

		} while (flag == false);

		scanner.close();
	}

}
