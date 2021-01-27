/*
 * ��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������, 
 * ����� ������� � ������ �����. 
 * m � n �������� � ����������
 */

package by.epam.jo_01_03_07.bean;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("������� ����������� ����� m ���������� [m,n] ");
		int m = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("������� ����������� ����� n ���������� [m,n] ");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		for (int i = m; i <= n; i++) {

			if (i % 2 == 0) {

				System.out.print("�������� " + i + "(����� 1 � ������ ����): ");

				for (int y = 2; y <= i / 2; y++) {
					
					if (i % y == 0) {
						System.out.print(y + " ");
					}
		
				}

			} else {
				
				System.out.println("\n" + i + " �������� ������� ������");
				
			}

		}

		scanner.close();
		System.out.println("\n");
	}

}
