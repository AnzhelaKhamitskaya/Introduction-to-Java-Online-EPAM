/*
 *  —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное)
 */

package by.epam.jo_02_02_04.bean;

public class Program {

	public static void main(String[] args) {

		int n = 6;
		int[][] myArray = new int[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (i % 2 == 0) {
					System.out.print(myArray[i][j] = j + 1);
				} else {
					System.out.print(myArray[i][j] = n - j);
				}

			}

			System.out.println();
		}
	}

}
