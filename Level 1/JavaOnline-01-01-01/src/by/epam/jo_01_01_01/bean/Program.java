/*
 * �������  �������� �������: z = ( (a � 3 ) * b / 2) + c
 */

package by.epam.jo_01_01_01.bean;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		double a = 0;
		double b = 0;
		double c = 0;
		double z = 0;
		boolean flag = false;

		Scanner scanner;

		System.out.println("�������: z = ( (a � 3 ) * b / 2) + c");

		do {
			flag = true;

			System.out.print("������� �������� � ");

			scanner = new Scanner(System.in);

			if (scanner.hasNextDouble()) {
				
				a = scanner.nextDouble();
				scanner.nextLine();
				
			} else {
				
				System.out.println("�������� ������ ��������� ������!");
				flag = false;
				
			}
			
		} while (flag == false);


		do {
			
			flag = true;

			System.out.print("������� �������� b ");

			scanner = new Scanner(System.in);

			if (scanner.hasNextDouble()) {
				
				b = scanner.nextDouble();
				scanner.nextLine();
				
			} else {
				
				System.out.println("�������� ������ ��������� ������!");
				flag = false;
				
			}
			
		} while (flag == false);

		do {
			flag = true;

			System.out.print("������� �������� c ");

			scanner = new Scanner(System.in);

			if (scanner.hasNextDouble()) {
				
				c = scanner.nextDouble();
				scanner.nextLine();
				
			} else {
				
				System.out.println("�������� ������ ��������� ������!");
				flag = false;
				
			}
			
		} while (flag == false);

		scanner.close();

		z = ((a - 3) * b / 2) + c;

		System.out.println("�������� ������� z ����� " + z);

	}

}
