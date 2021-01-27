/*
 * Дана последовательность целых чисел n.
 * Образовать новую последовательность, выбросив из исходной те члены, которые равны min в этой последовательности
 */

package by.epam.jo_02_01_08.bean;

import static java.lang.System.*;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {

		double[] array = { -100, -4.1, 200, -100, 4.2, 6.9, 7.0, -4.1, -100, 0.3 };
		
		double minElement = array[0];
		double[] arrayNew;
		int quantityMinElements = 0;
		int indexElementNewArray = 0;

		for (int i = 1; i < array.length; i++) {

			if (array[i] < minElement) {
				minElement = array[i];
			}
		}

		for (int i = 0; i < array.length; i++) {

			if (array[i] == minElement) {
				quantityMinElements++;
			}
		}

		arrayNew = new double[array.length - quantityMinElements];

		for (int i = 0; i < array.length; i++) {

			if (array[i] != minElement) {
				arrayNew[indexElementNewArray] = array[i];
				indexElementNewArray++;

			}
		}

		out.println(Arrays.toString(arrayNew));
	}
}
