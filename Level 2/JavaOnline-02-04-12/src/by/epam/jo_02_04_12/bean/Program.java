// Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
// являются числа, сумма цифр которых равна К и которые не большее N.

package by.epam.jo_02_04_12.bean;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		int maxValue = 50;
		int sumOfNumeral = 5;

		List<Integer> list = getList(maxValue, sumOfNumeral);

		printList(list);
	}

	private static void printList(List<Integer> list) {

		if (list.isEmpty()) {

			System.out.print("Не существует");

		}
		for (int element : list) {

			System.out.print(element + " ");

		}
	}

	private static List<Integer> getList(int maxValue, int sumOfNumeral) {

		List<Integer> list = new ArrayList<>();

		for (int element = 0; element <= maxValue; element++) {

			if (getSum(element) == sumOfNumeral) {

				list.add(element);
			}
		};
		
		return list;
	}

	private static int getSum(int element) {

		int n = element;
		int sum = 0;

		while (n / 10 > 0) {
			sum += n % 10;
			n = (n - n % 10) / 10;
		}

		if (n / 10 < 10) {
			sum += n;
		}
		return sum;
	}
}
