/*
 *  Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы
 */
package by.epam.jo_02_01_04.bean;

import static java.lang.System.*;

public class Program {

	public static void main(String[] args) {

		int max = 0;
		int min = 0;
		int maxPosition = 0;
		int minPosition = 0;
		int temp = 0;

		int[] array = { -50, 5, 0, -123, 16, 18, 1, 0 };

		out.print("Дан массив ");

		for (int i = 0; i < array.length; i++) {

			out.print(array[i] + " ");
		}

		max = array[0];
		min = array[0];

		for (int i = 1; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
				maxPosition = i;

			}

			if (array[i] < min) {
				min = array[i];
				minPosition = i;
			}
		}

		out.println();

		temp = array[maxPosition];
		array[maxPosition] = array[minPosition];
		array[minPosition] = temp;
		
		out.print("           ");

		for (int i = 0; i < array.length; i++) {

			out.print(array[i] + " ");
		}

	}
}
