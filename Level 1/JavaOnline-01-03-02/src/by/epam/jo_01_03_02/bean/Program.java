/*
 * ��������� �������� ������� �� ������� [�,b] c ����� h
 */

package by.epam.jo_01_03_02.bean;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		double y = 0;
		double x = 0;
		double a = 0;
		double b = 0;
		double h = 0;
		boolean flag = false;
		Scanner scanner;

		do {

			flag = true;

			System.out.print("�������, ����������, �������� � �� ������� [a,b] ");
			scanner = new Scanner(System.in);

			if (scanner.hasNextDouble()) {

				a = scanner.nextDouble();

			} else {

				flag = false;
				System.out.println("�������� ������! ");

			}

		} while (!flag);

		do {

			flag = true;
			System.out.print("�������, ����������, �������� b �� ������� [a,b] ");

			scanner = new Scanner(System.in);

			if (scanner.hasNextDouble()) {

				b = scanner.nextDouble();

			} else {

				flag = false;
				System.out.println("�������� ������! ");

			}

		} while (!flag);

		do {

			flag = true;
			System.out.print("�������, ����������, �������� h (���) �� ������� [a,b] ");

			scanner = new Scanner(System.in);
			if (scanner.hasNextDouble()) {

				h = scanner.nextDouble();

				if (h == 0) {

					flag = false;
					System.out.println("��� �� ������ ��������� 0!");
				}

			} else {

				flag = false;
				System.out.println("�������� ������! ");

			}

		} while (!flag);

		do {

			flag = true;

			System.out.print("�������, ����������, �������� ���������� x ������� ");
			scanner = new Scanner(System.in);

			if (scanner.hasNextDouble()) {

				x = scanner.nextDouble();

			} else {

				flag = false;
				System.out.println("�������� ������! ");

			}

		} while (!flag);
		
		scanner.close();

		for (x = a; x <= b; x += h) {

			if (x == 0 || x > 2) {
				
				y = x;
				
			} else if (x <= 2) {

				y = -x;

			} 

			System.out.println("�������� ������� �� ������� [" + a + "," + b + "] c ����� " + h + " ����� " + y);
		}

	}

}
