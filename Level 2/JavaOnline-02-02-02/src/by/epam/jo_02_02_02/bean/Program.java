/*
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
 */

package by.epam.jo_02_02_02.bean;

public class Program {

	public static void main(String[] args) {

		int[][] myArr = new int[6][6];
		myArr[0] = new int[] { 6, 3, 5, 0, 9, 9 };
		myArr[1] = new int[] { 2, 0, 0, 3, 5, 0 };
		myArr[2] = new int[] { 5, 0, 0, 0, 5, 0 };
		myArr[3] = new int[] { 3, 0, 0, 4, 5, 0 };
		myArr[4] = new int[] { 3, 0, 0, 0, 5, 0 };
		myArr[5] = new int[] { 3, 0, 0, 0, 5, 0 };
 
		// 1 вариант
		for (int r = 0, c = 0; r < myArr.length; r++, c++) {

			System.out.print(myArr[r][c] + " ");
		}
		
		System.out.println();
		
		for (int r = 0, c = myArr.length-1; r < myArr.length; r++, c--) {

			System.out.print(myArr[r][c] + " ");
		}

		System.out.println();
		
		// 2 вариант
		int reverse = myArr.length - 1;

		for (int r = 0; r < myArr.length; r++) {

			for (int c = 0; c < myArr.length; c++) {

				if (c != reverse) {

					System.out.print("  ");
				}

				else {
					System.out.print(myArr[r][c] + " ");
				}
			}
			reverse--;
			System.out.println();
		}

		for (int r = 0; r < myArr.length; r++) {

			for (int c = 0; c <= r; c++) {

				if (r == c) {
					System.out.print(myArr[r][c] + " ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}
}
