/*
 * Пусть даны две неубывающие последовательности действительных чисел.
 * Требуется указать те места, на которые нужно вставлять элементы второй последовательности в первую так,
 * чтобы новая последовательность оставалась возрастающей
 */

package by.epam.jo_02_03_07.bean;

public class Program {

	public static void main(String[] args) {

		int[] arr_1 = new int[] { 0, 1, 3, 5, 5, 9 };
		int[] arr_2 = new int[] { -1, -2, 5, 24 };
		int index;

		for (int i = 0; i < arr_2.length; i++) {

			index = BinarySearch(arr_2[i], 0, arr_1.length - 1, arr_1);

			if (index == arr_1.length - 1) {
				
				System.out.println("Элемент " + arr_2[i] + " вставить после элемента " + arr_1[index]);
				
			} else {
				
				System.out.println("Элемент " + arr_2[i] + " вставить перед элементом " + arr_1[index]);
				
			}
		}
	}

	public static int BinarySearch(int element, int right_index, int left_index, int[] arr) {

		int middle_index = right_index + (left_index - right_index) / 2;

		if (element <= arr[right_index]) {
			
			return right_index;
			
		} else if (element == arr[middle_index]) {
			
			return middle_index;
			
		} else if (element > arr[left_index]) {
			
			return left_index;
			
		} else if (element < middle_index) {
			
			return BinarySearch(element, 0, middle_index - 1, arr);
		}

		return BinarySearch(element, middle_index + 1, left_index, arr);
	}

}
