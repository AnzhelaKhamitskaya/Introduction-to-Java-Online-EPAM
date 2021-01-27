/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

package by.epam.jo_02_02_03.bean;

public class Program {

	public static void main(String[] args) {

		int[][] myArr = new int[6][5];
		myArr[0] = new int[] { 6, 3, 5, 0, 9 };
		myArr[1] = new int[] { 2, 8, 0, 3, 0 };
		myArr[2] = new int[] { 5, 0, 0, 0, 5 };
		myArr[3] = new int[] { 3, 0, 0, 4, 5 };
		myArr[4] = new int[] { 3, 0, 0, 0, 5 };
		myArr[5] = new int[] { 3, 0, 2, 0, 5 };

		int r = 2;
		int c = 4;

		for (int row = 0; row < myArr.length; row++) {

			for (int column = 0; column < myArr[row].length; column++) {

				if (row == r - 1 || column == c - 1) {

					System.out.print(myArr[row][column] + " ");

				} else {

					System.out.print("  ");

				}

			}
			System.out.println();
		}
	}

}
