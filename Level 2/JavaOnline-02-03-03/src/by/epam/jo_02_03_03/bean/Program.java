/*
 * ���������� �������. ���� ������������������ �����.��������� ����������� �������� ���,
 * ����� ��� ���� ����������� �� ��������. ��� ����� � �������, ������� � �������, ���������� ����������
 * ������� � �������� �� ������ �����, � ������ - �� ����� �����������. �����, ������� �� �������, ��� ���������
 * �����������. �������� �������� ���������� �������.
 */

package by.epam.jo_02_03_03.bean;

public class Program {

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 4, 16, 1, 5, 0, 9 };
		int max_index;
		int var;

		for (int i = 0; i < arr.length; i++) {

			max_index = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] > arr[max_index]) {

					max_index = j;
				}
			}

			var = arr[i];
			arr[i] = arr[max_index];
			arr[max_index] = var;

			System.out.print(arr[i] + " ");

		}
	}

}
