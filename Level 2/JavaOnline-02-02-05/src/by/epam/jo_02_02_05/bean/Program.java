/*
 *  —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное)
 */

package by.epam.jo_02_02_05.bean;

public class Program {

	public static void main(String[] args) {

		int n = 6;
		int[][] myArray = new int[n][n];

		int revers = n;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (j < revers) {
					System.out.print(myArray[i][j] = i + 1);
				} else {
					System.out.print(myArray[i][j] = 0);
				}

			}

			revers--;
			System.out.println();
		}

	}

}
