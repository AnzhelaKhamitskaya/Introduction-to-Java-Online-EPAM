// Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
// возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
// использовать декомпозицию.

package by.epam.jo_02_04_14.bean;

import java.util.List;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {

		int k = 9800817;

		List<Integer> list = getList(k);

		System.out.println("Все числа Армстронга на отрезке [1; " + k + "]:");

		printList(list);
	}

	private static void printList(List<Integer> list) {

		if (list.isEmpty()) {
			System.out.print("Не существует");
		}
		for (int element : list) {
			System.out.println(element + " ");
		}
	}

	private static List<Integer> getList(int k) {

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= k; i++) {

			if (checkNumericArmstrong(i)) {
				list.add(i);
			}

		}
		return list;
	}

	private static boolean checkNumericArmstrong(int i) {

		boolean flag = false;

		int q = getQ(i);

		if (checkSum(i, q)) {
			flag = true;
		}

		return flag;
	}

	private static int getQ(int i) {
		int n = i;
		int q = 0;

		while (n / 10 > 0) {
			q++;
			n = (n - n % 10) / 10;
		}

		q++;

		return q;

	}

	private static boolean checkSum(int i, int q) {
		int N = i;
		int sum = 0;

		boolean flag = false;

		while (N / 10 > 0) {
			sum += Math.pow(N % 10, q);
			N = (N - N % 10) / 10;
		}

		sum += Math.pow(N % 10, q);

		if (sum == i) {
			flag = true;
		}

		return flag;
	}
}
