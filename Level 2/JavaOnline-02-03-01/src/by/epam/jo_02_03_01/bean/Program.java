/*
 * Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 * один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
 * дополнительный массив.
 */

package by.epam.jo_02_03_01.bean;

public class Program {

	public static void main(String[] args) {
		int[] arr_1 = new int[] { 1, 2, 3, 4, 5, 6, 12 };
		int[] arr_2 = new int[] { 7, 8, 9, 10, 11 };
		int[] arr_3 = new int[arr_1.length + arr_2.length];

		int k = 6;

		if (k > 0 && k < arr_1.length) {

			for (int i = 0, j = 0; i < arr_3.length; i++) {

				if (i < k) {

					arr_3[i] = arr_1[i];
					System.out.print(arr_3[i] + " ");

				} else if (i > k - 1 && i < k + arr_2.length) {

					arr_3[i] = arr_2[j];
					j++;
					System.out.print(arr_3[i] + " ");

				} else {

					arr_3[i] = arr_1[k];
					System.out.print(arr_3[i] + " ");

				}
			}
		}
	}

}
