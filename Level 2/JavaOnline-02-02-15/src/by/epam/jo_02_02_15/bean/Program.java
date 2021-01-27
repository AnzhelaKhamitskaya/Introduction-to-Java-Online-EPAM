/*
 *  Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
 */

package by.epam.jo_02_02_15.bean;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = -1;
		int column = -1;
		boolean flagRow = false;
		boolean flagColumn = false;
		int maxE = 0;

		do {
			System.out.print("Введите число строк: ");
			Scanner scanner = new Scanner(System.in);

			if (scanner.hasNextInt()) {

				row = scanner.nextInt();

				if (row <= 0) {

					System.out.println("2 - Ведите целое положительное число больше 0");

				} else {

					flagRow = true;
					scanner.close();
				}

			} else {

				System.out.println("1 - Ведите целое положительное число больше 0");

			}

		} while (!flagRow);

		do {
			System.out.print("Введите число столбцов: ");

			Scanner scanner = new Scanner(System.in);

			if (scanner.hasNextInt()) {

				column = scanner.nextInt();

				if (column <= 0) {

					System.out.println("2 - Ведите целое положительное число больше 0");

				} else {

					flagColumn = true;
					scanner.close();
				}

			} else {

				System.out.println("1 - Ведите целое положительное число больше 0");

			}

		} while (!flagColumn);

		int[][] myArray = new int[row][column];

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				myArray[i][j] = (int) (Math.random() * 90 + 10);
				System.out.print(myArray[i][j] + " ");
			}

			System.out.println();
		}

		for (int[] rows : myArray) {
			int[] rows_ = Arrays.copyOf(rows, rows.length);
			Arrays.sort(rows_);
			if (rows_[rows.length - 1] > maxE) {
				maxE = rows_[rows.length - 1];
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Максимальный элемент равен: " + maxE);
		System.out.println();
		System.out.println();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (myArray[i][j] % 2 > 0) {
					myArray[i][j] = maxE;
				}
			}
		}

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				System.out.print(myArray[i][j] + " ");
			}

			System.out.println();
		}
	}

}
