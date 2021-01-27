/*
 * ƒл€ данной области составить линейную программу, котора€ печатает
 * true, если точка с координатами (х, у) принадлежит закрашенной области, и
 * false Ч в противном случае
 * использовать один или два сканера? считывает строку как дабл или как строку?
 * где закрывать c учетом блока кода?
 */

package by.epam.jo_01_01_06.bean;

import java.util.Scanner;
import static java.lang.System.*;

public class Program {

	public static void main(String[] args) {

		double x = 0;
		double y = 0;
		boolean flag = false;
		boolean answer = false;
		Scanner scanner;

		do {
			flag = true;

			System.out.print("¬ведите координату точки x, пожалуйста: ");

			scanner = new Scanner(System.in);

			if (scanner.hasNextDouble()) {

				x = scanner.nextDouble();
				scanner.nextLine();

				do {
					flag = true;

					System.out.print("¬ведите координату точки y, пожалуйста: ");

					scanner = new Scanner(System.in);

					if (scanner.hasNextDouble()) {

						y = scanner.nextDouble();
						scanner.nextLine();

						answer = (x > 4 || x < -4 || y > 4 || y < -3) || ((x > 2 || x < -2) && y > 0) ? false : true;

						out.println(answer);

					} else {

						flag = false;
						System.out.println("Ќеверный формат данных y!");

					}

				} while (!flag);

			} else {

				flag = false;
				System.out.println("Ќеверный формат данных x!");

			}

		} while (!flag);

		scanner.close();
	}

}
