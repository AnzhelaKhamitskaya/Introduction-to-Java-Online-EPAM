/*
 * �������� ���������, ��� ������������ ������ ����� ����� ������������� �����. 
 * � ��������� ��������� ��� ����� �� 1 �� ���������� ������������� �����
 */

package by.epam.jo_01_03_01.bean;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int number = -1;
		int sumNumbers = 0;
		int counter = 0;
		boolean flag;
		Scanner scanner;
		
		System.out.print("�������, ����������, ����� ������������� ����� ");

		do {
			
			flag = true;
			scanner = new Scanner(System.in);
			
			if (scanner.hasNextInt()) {

				number = scanner.nextInt();			
				
				if (number <= 0) {

					flag = false;
					System.out.print("������� ����� ������������� �����! ");

				} else {
					scanner.close();
					
					for (; counter <= number; counter++) {

						sumNumbers += counter;
						
						if(sumNumbers < 0) {
							System.out.println("������� ������� �����!");
							break;
						}

					}
					if(sumNumbers > 0) {
						System.out.println("����� ����� �� �� 1 �� " + number + " ����� " + sumNumbers);
					}
				}

			} else {

				flag = false;
				System.out.print("������� ����� ������������� �����! ");

			}

		} while (!flag);

	}

}
