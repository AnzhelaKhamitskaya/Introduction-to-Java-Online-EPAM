/* 
 * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
 * Делается это следующим образом: сравниваются два соседних элемента. 
 * Составить алгоритм этой сортировки.
 */

package by.epam.jo_02_03_06.bean;

public class Program {

	public static void main(String[] args) {

		int[] arr_random = new int[] { 3, 2, 0, 5, 6, 7, 7, 9, 4 };

		for (int i = 0; i < arr_random.length - 1; i++) {

			if (arr_random[i] > arr_random[i + 1]) {
				int temp = arr_random[i];
				arr_random[i] = arr_random[i + 1];
				arr_random[i + 1] = temp;
				i = i == 0 ? 0 : i - 2;
			}

		}

		for (int i = 0; i < arr_random.length; i++) {

			System.out.print(arr_random[i]);

		}

	}

}
