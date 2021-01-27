/*
 *  Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
 *  единиц равно номеру столбца.
 */

package by.epam.jo_02_02_14.bean;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int row = -1;
		int column = -1;
		boolean flagRow = false;
		boolean flagColumn = false;

		
		do {
			System.out.print("Введите число строк: ");
			Scanner scanner = new Scanner(System.in);

			if (scanner.hasNextInt()) {

				row = scanner.nextInt();

				if (row <= 0) {

					System.out.println("Ведите целое положительное число больше 0");

				} else {

					flagRow = true;
					scanner.close();
				}

			} else {

				System.out.println("Ведите целое положительное число больше 0");

			}

		} while (!flagRow);

		
		do {
			System.out.print("Введите число столбцов: ");

			Scanner scanner = new Scanner(System.in);

			if (scanner.hasNextInt()) {

				column = scanner.nextInt();

				if (column <= 0 || column > row) {

					System.out.println("Ведите целое положительное число, не прывышающее число строк");

				} else {

					flagColumn = true;
					scanner.close();
				}

			} else {

				System.out.println("Ведите целое положительное число больше 0");

			}

		} while (!flagColumn);
		

		int[][] myArray = new int[row][column];
		

		for (int[] rows : myArray) {

			Arrays.fill(rows, 0);
		}
		

		for (int j = 0; j < column; j++) {

			int k = j + 1;

			while (k != 0) {

				int i = (int) (Math.random() * row);

				if (myArray[i][j] == 0) {
					
					myArray[i][j] = 1;
					k--;
				}
			}
		}
		
		System.out.println();
		System.out.println();
		

		for (int i = 0; i < row; i++) {
			
			for (int j = 0; j < column; j++) {

				System.out.print(myArray[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}
