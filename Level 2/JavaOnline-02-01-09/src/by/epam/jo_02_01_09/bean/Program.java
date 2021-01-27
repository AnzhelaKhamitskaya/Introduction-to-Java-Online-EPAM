/*
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
 * Если таких чисел несколько, то определить наименьшее из них.
 */

package by.epam.jo_02_01_09.bean;

import static java.lang.System.*;

public class Program {

	public static void main(String[] args) {

		int[] array = new int[] { 0, 1, 100, -100, -100, 0, -100, 0 };

		int maxNumberRepetitions = 1;
		int index = 0;
		int numberRepetitions;

		for (int i = 0; i < (array.length - 1); i++) {

			numberRepetitions = 1;

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j]) {

					numberRepetitions++;

				}
			}

			if (numberRepetitions > maxNumberRepetitions) {

				maxNumberRepetitions = numberRepetitions;
				index = i;

			} else if (numberRepetitions == maxNumberRepetitions && array[index] > array[i]) {

				index = i;

			}

		}
		out.println("Наиболее часто встречающееся число (наименьшее из одинаково часто всречающихся) является "
				+ array[index] + " (количество повторений - " + maxNumberRepetitions + ")");
	}
}
