/*
 * ���� ��� ���� ������������ (� ��������). 
 * ����������, ���������� �� ����� �����������, � ���� ��, �� ����� �� �� �������������.
 */
package by.epam.jo_01_02_01;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		final double sumAnglesTriangle = 180;

		double x = 0;
		double y = 0;
		boolean flag = false;
		Scanner scanner;

		do {

			flag = true;

			System.out.print("������� ������ ���� ������������ ");

			scanner = new Scanner(System.in);

			if (scanner.hasNextDouble()) {

				x = scanner.nextDouble();

				if (x > 0) {

					do {
						
						flag = true;

						System.out.print("������� ������ ���� ������������ ");

						scanner = new Scanner(System.in);

						if (scanner.hasNextDouble()) {

							y = scanner.nextDouble();

							if (y > 0) {

								if ((x + y) >= sumAnglesTriangle) {

									System.out.println("����������� � ��������� ������ �� ����������");

								} else if ((x + y) == 90 || x == 90 || y == 90) {

									System.out.println("����������� �������� �������������");

								} else {

									System.out.println("����������� �� �������� �������������");

								}

							} else {

								flag = false;

								System.out.println("������� ����� ������ ����!");

							}

						} else {

							flag = false;

							System.out.println("�������� ������ ������!");

						}

					} while (!flag);

				} else {

					flag = false;

					System.out.println("������� ����� ������ ����!");

				}

			} else {

				flag = false;

				System.out.println("�������� ������ ������!");
			}

		} while (!flag);

		scanner.close();
	}

}
