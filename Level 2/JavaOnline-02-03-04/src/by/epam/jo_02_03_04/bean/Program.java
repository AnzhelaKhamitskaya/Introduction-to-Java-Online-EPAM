/*
 * ���������� ��������. ���� ������������������ ����� a1 < a2 < an.��������� ����������� ����� �
 * ������� �����������. ��� ����� ������������ ��� �������� �����
 * ai � ai+1. ���� ai < ai+1, �� �������� ������������. ��� ������������ �� ��� ���,
 * ��� �������� �� ������ ����������� � ������� �����������.
 * ��������� �������� ����������, ����������� ��� ���� ���������� ������������
 */

package by.epam.jo_02_03_04.bean;

public class Program {

	public static void main(String[] args) {
		
		int[] arr = new int[] { 4, 5, 2, 7, 8, 9, 10 };

		int count = 0;
		boolean flag = true;

		while (flag) {
			flag = false;

			for (int i = 0; i < arr.length - 1; i++) {

				if (arr[i] < arr[i + 1]) {
					flag = true;
					int var = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = var;
					count++;
				}
			}

			for (int i = 0; i < arr.length; i++) {

				System.out.print(arr[i] + " ");
			}
			System.out.println();

		}
		System.out.print("\n����� ������������, ��. " + count);

	}

}
