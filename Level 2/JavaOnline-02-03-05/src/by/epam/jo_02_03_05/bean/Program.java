/* 
 * Сортировка вставками. Дана последовательность чисел. Требуется переставить числа в порядке
 * возрастания. Делается это следующим образом. Пусть есть упорядоченная последовательность. Берется следующее число
 * и вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей. 
 * Процесс производится до тех пор, пока все элементы не будут перебраны. Примечание. 
 * Место помещения очередного элемента в отсортированную часть производить
 * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */

package by.epam.jo_02_03_05.bean;

public class Program {

	public static void main(String[] args) {

		int[] arr_random = new int[] { 1, 2, 3, 0, 5, 4, 4, 16 };

		int i = 0;
		int n = 0;
		int temp;

		while (arr_random[i] <= arr_random[i + 1]) {
			i++;
		}

		for (int j = i + 1; j < arr_random.length; j++) {

			n = BinarySearch(arr_random[j], 0, arr_random, j);

			temp = arr_random[j];

			for (int k = j; k > n + 1; k--) {

				arr_random[k] = arr_random[k - 1];

			}

			arr_random[n + 1] = temp;

		}

		for (int z = 0; z < arr_random.length; z++) {

			System.out.print(arr_random[z] + " ");

		}
	}

	private static int BinarySearch(int elem, int start, int[] arr, int end) {

		int mid = start + (end - start) / 2;

		if (elem < arr[start]) {
			return -1;
		}

		if (elem > arr[end]) {
			return end;
		}

		if (arr[mid] < elem && elem <= arr[mid + 1]) {
			return mid;
		}

		if (arr[mid] > elem) {
			return BinarySearch(elem, start, arr, mid - 1);
		}
		return BinarySearch(elem, mid + 1, arr, end);
	}

}
