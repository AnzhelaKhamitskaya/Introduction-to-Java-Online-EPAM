/*
 * ��� ������ ������� ��������� �������� ���������, ������� ��������
 * true, ���� ����� � ������������ (�, �) ����������� ����������� �������, �
 * false � � ��������� ������
 * ������������ ���� ��� ��� �������? ��������� ������ ��� ���� ��� ��� ������?
 * ��� ��������� c ������ ����� ����?
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

			System.out.print("������� ���������� ����� x, ����������: ");

			scanner = new Scanner(System.in);

			if (scanner.hasNextDouble()) {

				x = scanner.nextDouble();
				scanner.nextLine();

				do {
					flag = true;

					System.out.print("������� ���������� ����� y, ����������: ");

					scanner = new Scanner(System.in);

					if (scanner.hasNextDouble()) {

						y = scanner.nextDouble();
						scanner.nextLine();

						answer = (x > 4 || x < -4 || y > 4 || y < -3) || ((x > 2 || x < -2) && y > 0) ? false : true;

						out.println(answer);

					} else {

						flag = false;
						System.out.println("�������� ������ ������ y!");

					}

				} while (!flag);

			} else {

				flag = false;
				System.out.println("�������� ������ ������ x!");

			}

		} while (!flag);

		scanner.close();
	}

}
