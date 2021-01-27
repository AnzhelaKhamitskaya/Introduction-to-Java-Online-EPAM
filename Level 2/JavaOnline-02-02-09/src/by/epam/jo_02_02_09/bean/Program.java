/*
 * Задана матрица неотрицательных чисел. 
 * Посчитать сумму элементов в каждом столбце. 
 * Определить, какой столбец содержит максимальную сумму.
 */

package by.epam.jo_02_02_09.bean;

public class Program {

	public static void main(String[] args) {

		int n = 4;
		double sum = 0;
		double sum_max = 0;
		int[] arr = new int[n];
		int numberOfColumn = -1;

		double[][] myArray = new double[n][n];
		myArray[0] = new double[] { 1, 0, 0, 3 };
		myArray[1] = new double[] { 0, 1, 3, 0 };
		myArray[2] = new double[] { 0, 0, 0, 0 };
		myArray[3] = new double[] { 0, 2, 0, 0 };

		System.out.print("Номера столбцов матрицы с большей суммой элементов: ");

		for (int i = 0; i < n; i++) {

			sum = 0;

			for (int j = 0; j < n; j++) {

				sum += myArray[j][i];

			}

			if (sum > sum_max) {

				sum_max = sum;
				arr = new int[n];
				numberOfColumn = -1;
				numberOfColumn++;
				arr[numberOfColumn] = i + 1;
			} else if (sum == sum_max) {

				numberOfColumn++;
				arr[numberOfColumn] = i + 1;

			}
		}

		for (int i = 0; i < n; i++) {

			System.out.print(arr[i]);

			if (i < n - 1 && arr[i + 1] == 0) {
				
				System.out.println(".");
				System.out.println("Сумма равна " + sum_max);
				return;
				
			} else {
				
				System.out.print(", ");
			}
		}
	}

}
