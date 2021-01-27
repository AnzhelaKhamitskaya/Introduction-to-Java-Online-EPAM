
/*
 * � �������� ������� �������� ������� ��� ������� ����� �������, �. �. ��� �������� ������ ������� ���������
 * �� ��������������� �� ������� �������, � ��� �������� ������� ����������� � ������. ������ �������� ������
 * ������������ � ����������
 */

package by.epam.jo_02_02_08.bean;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		int n = 4;
		int temp = 0;
		int c1 = 0;
		int c2 = 0;
		boolean flag = false;
		Scanner scanner;

		do {

			System.out.print("������� ����� ������� �� 1 �� " + n + ": ");

			scanner = new Scanner(System.in);

			if (scanner.hasNextInt()) {

				c1 = scanner.nextInt();
				scanner.nextLine();
				flag = true;

			} else {

				System.out.println("�������� ������ ��������� ������!");
			}

		} while (flag == false);

		do {

			System.out.print("������� ����� ������� �� 1 �� " + n + ": ");

			scanner = new Scanner(System.in);

			if (scanner.hasNextInt()) {

				c2 = scanner.nextInt();
				flag = true;

			} else {

				System.out.println("�������� ������ ��������� ������!");
			}

		} while (flag == false);

		scanner.close();

		int[][] myArray = new int[n][n];

		myArray[0] = new int[] { 4, 2, 3, 1 };
		myArray[1] = new int[] { 4, 2, 3, 1 };
		myArray[2] = new int[] { 4, 2, 3, 1 };
		myArray[3] = new int[] { 4, 2, 3, 1 };

		for (int i = 0; i < n; i++) {

			temp = myArray[i][c1 - 1];
			myArray[i][c1 - 1] = myArray[i][c2 - 1];
			myArray[i][c2 - 1] = temp;
			
			for (int j = 0; j < n; j++) {
				System.out.print(myArray[i][j]);
			}
			
			System.out.println();

		}

	}
}
