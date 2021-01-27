/*
 * ���� ����������� ����� �, ������� ������������ ������������ ���������� ������� � ��������. 
 * ������� ������ �������� ������������ � �����, ������� � �������� � ��������� �����: ��� ����� SSc.
 */

package by.epam.jo_01_01_05.bean;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int time = 0;
		int h = 0;
		int min = 0;
		int sec = 0;
		boolean flag = false;
		Scanner scanner;

		do {

			flag = true;

			System.out.print("������� ���������� ������ ");

			scanner = new Scanner(System.in);

			if (scanner.hasNextInt()) {

				time = scanner.nextInt();
				scanner.nextLine();

				if (time >= 0) {

					h = time / 3600;
					min = time % 3600 / 60;
					sec = time % 3600 % 60;

					System.out.format("%02d� %02d��� %02d�%n", h, min, sec);
					//System.out.format("%02d��� ", min);
					//System.out.format("%02d�%n", sec);

				} else {

					flag = false;
					System.out.println("������ ������������� �����!");
				}

			} else {

				flag = false;
				System.out.println("������� ����� �����!");
			}

		} while (flag == false);

		scanner.close();
	}

}
