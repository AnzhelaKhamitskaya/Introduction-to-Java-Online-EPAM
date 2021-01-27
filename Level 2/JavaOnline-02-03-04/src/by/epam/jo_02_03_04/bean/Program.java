/*
 * Сортировка обменами. Дана последовательность чисел a1 < a2 < an.Требуется переставить числа в
 * порядке возрастания. Для этого сравниваются два соседних числа
 * ai и ai+1. Если ai < ai+1, то делается перестановка. Так продолжается до тех пор,
 * все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок
 */

package by.epam.jo_02_03_04.bean;

public class Program {

	public static void main(String[] args) {
		
		int[] arr = new int[] { 4, 5, 2, 7, 8, 9, 10 };

		int count = 0;
		boolean flag = true;

		while (flag) {
			flag = false;

			for (int i = 0; i < arr.length - 1; i++) {

				if (arr[i] < arr[i + 1]) {
					flag = true;
					int var = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = var;
					count++;
				}
			}

			for (int i = 0; i < arr.length; i++) {

				System.out.print(arr[i] + " ");
			}
			System.out.println();

		}
		System.out.print("\nИТОГО перестановок, шт. " + count);

	}

}
