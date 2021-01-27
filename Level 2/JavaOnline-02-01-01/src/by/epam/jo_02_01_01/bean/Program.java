/*
 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */

package by.epam.jo_02_01_01.bean;

import static java.lang.System.*;

public class Program {

	public static void main(String[] args) {

		final double K = 10;
		int sum = 0;

		int[] array = new int[] {1, 15, 20, 16, 110, 30, 120};

		for (int i = 0; i < array.length; i++) {

			Boolean rez = (array[i] % K) == 0 ? true : false;

			if (rez) {
				sum += array[i];
			}
		}

		out.println(sum);
	}

}
