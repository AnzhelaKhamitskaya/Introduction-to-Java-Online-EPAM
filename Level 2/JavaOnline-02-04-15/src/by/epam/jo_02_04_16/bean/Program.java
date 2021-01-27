// Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
// последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.

package by.epam.jo_02_04_16.bean;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		int n = 4;

		List<Integer> list = getList(n);

		System.out.println("Список " + n + "-значных чисел, цифры в которых образуют строго возрастающую "
				+ "последовательность:");

		printList(list);
	}

	private static void printList(List<Integer> list) {

		if (list.isEmpty()) {
			System.out.print("Не существует");
		} else {
			for (int element : list) {
				System.out.println(element + " ");
			}
		}
	}

	private static List<Integer> getList(int n) {

		int to = getRange(n);

		List<Integer> list = new ArrayList<>();

		for (int i = 10; i < to; i++) {

			if (checkNumeric(i)) {
				list.add(i);
			}

		}
		return list;
	}

	private static int getRange(int n) {
		int N = n;
		int from = 10;

		while (N > 1) {
			from *= 10;
			N--;
		}

		return from;

	}

	private static boolean checkNumeric(int i) {

		boolean flag = false;

		if (isIncreasingSequence(i)) {
			flag = true;
		}

		return flag;
	}

	private static boolean isIncreasingSequence(int i) {

		int N = i;
		boolean flag = true;
		int firstNumber = N % 10;
		N = (N - N % 10) / 10;

		while (N / 10 > 0 && N % 10 < firstNumber) {
			firstNumber = N % 10;
			N = (N - N % 10) / 10;
		}

		if (N % 10 >= firstNumber) {
			flag = false;
		}

		return flag;
	}
}
