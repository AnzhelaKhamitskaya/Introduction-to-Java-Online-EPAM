/*
 * Даны две неубывающие последовательности. Образовать из них новую последовательность
 * чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */

package by.epam.jo_02_03_02.bean;

public class Program {

	public static void main(String[] args) {

		int[] arr_1 = new int[] { 1, 3, 5 };
		int[] arr_2 = new int[] { 2, 4, 6, 8, 10 };
		int[] arr_3 = new int[arr_1.length + arr_2.length];

		for (int i = 0, k1 = 0, k2 = 0; i < arr_3.length; i++) {

			if (k2 >= arr_2.length || k1 < arr_1.length && arr_1[k1] < arr_2[k2]) {
				arr_3[i] = arr_1[k1];
				System.out.print(arr_3[i] + " ");
				k1++;
			} else {
				arr_3[i] = arr_2[k2];
				System.out.print(arr_3[i] + " ");
				k2++;
			}

		}
	}

}
