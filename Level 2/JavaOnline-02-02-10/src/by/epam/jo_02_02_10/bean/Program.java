/*
 *  Ќайти положительные элементы главной диагонали квадратной матрицы.
 */

package by.epam.jo_02_02_10.bean;

public class Program {

	public static void main(String[] args) {

		int n = 4;

		double[][] myArray = new double[n][n];

		myArray[0] = new double[] { 4, 0, 0, 0 };
		myArray[1] = new double[] { 0, -2, 0, 0 };
		myArray[2] = new double[] { 0, 0, 0, 0 };
		myArray[3] = new double[] { 0, 0, 0, 3 };

		for (int i = 0; i < n; i++) {

			if (myArray[i][i] >= 0)
				System.out.print(myArray[i][i] + "  ");

		}

	}

}
