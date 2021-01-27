/*
 * Дан целочисленный массив с количеством элементов п.
 * Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы заполнить нулями).
 * Примечание. Дополнительный массив не использовать.
 */

package by.epam.jo_02_01_10.bean;

import static java.lang.System.*;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		int i = 1;
		int j = 1;

		if (array.length < 2) {

			out.println("Количество элементов в массиве менее 2 или массив не существует");

		} else if (array.length == 2) {

			array[i] = 0;

		} else {

			for (; (i + j) < array.length; i++, j++) {

				array[i] = array[i + j];

			}

			for (; i < array.length; i++) {

				array[i] = 0;

			}
		}

		out.println(Arrays.toString(array));
	}
}
