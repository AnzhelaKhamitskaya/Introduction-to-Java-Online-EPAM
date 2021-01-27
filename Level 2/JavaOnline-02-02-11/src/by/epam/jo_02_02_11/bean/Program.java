/*
 *  ������� 10x20 ��������� ���������� ������� �� 0 �� 15. 
 *  ������� �� ����� ���� ������� � ������ �����, �
 *  ������� ����� 5 ����������� ��� � ����� ���.
 */

package by.epam.jo_02_02_11.bean;

public class Program {

	public static void main(String[] args) {

		int[][] myArray = new int[10][20];
		
		int k = 0;

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 20; j++) {
				
				myArray[i][j] = (int) (Math.random() * 16);
				System.out.print(myArray[i][j] + " ");

			}
			
			System.out.println();
		}

		System.out.print("������: ");

		for (int i = 0; i < 10; i++) {

			k = 0;

			for (int j = 0; j < 20; j++) {

				if (myArray[i][j] == 5)
					k++;

				if (k == 3) {
					System.out.print(i + 1 + " ");
					break;
				}
			}
		}
	}
}
