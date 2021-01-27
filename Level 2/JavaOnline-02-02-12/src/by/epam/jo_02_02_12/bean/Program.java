/*
 *  Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

package by.epam.jo_02_02_12.bean;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		int r = 5;
		int c = 8;

		int[][] myArray = new int[r][c];
		
		System.out.println("Исходный массив");
		
		for (int i = 0; i < r; i++) {
			
			for (int j = 0; j < c; j++) {
				
				myArray[i][j] = (int) (Math.random() * 10);
				System.out.print(myArray[i][j] + " ");
			}

			System.out.println();

		}
		
		System.out.println("Отсортированный массив по возрастанию значений элементов в строках");
		
		for (int i = 0; i < r; i++) {

			Arrays.sort(myArray[i]);

			for (int j = 0; j < c; j++) {
				
				System.out.print(myArray[i][j] + " ");
				
			}
			
			System.out.println();
		}

		System.out.println("Отсортированный массив по убыванию значений элементов в строках");

		for (int i = 0; i < r; i++) {

			Arrays.sort(myArray[i]);

			for (int j = c - 1; j >= 0; j--) {
				
				System.out.print(myArray[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
