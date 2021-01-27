// Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

package by.epam.jo_02_04_16.bean;

public class Program {

	public static void main(String[] args) {

		int n = 4;

		int Sum = getSum(n);

		System.out.println("Сумма " + n + "-значных чисел, содержащих только нечетные цифры: " + Sum);

		int q = getQ(Sum);

		System.out.println("Количество чётных цифр в найденной сумме: " + q);

	}

	private static int getQ(int sum) {
		int N = sum;

		int q = 0;

		while (N / 10 > 0) {
			if (N % 2 == 0) {
				q++;
			}

			N = (N - N % 10) / 10;
		}

		if (N % 2 == 0) {
			q++;
		}

		return q;
	}

	private static int getSum(int n) {

		int from = getFrom(n);
		int to = from * 10;

		int sum = 0;

		for (int i = from; i < to; i++) {
			if (checkNumeric(i)) {
				sum += i;
			}
		}
		return sum;
	}

	private static int getFrom(int n) {
		int from = 1;
		for (int i = n; i > 1; i--) {
			from *= 10;
		}
		return from;
	}

	private static boolean checkNumeric(int i) {

		int N = i;

		boolean flag = true;

		while (N / 10 > 0) {
			if (N % 10 % 2 == 0) {
				flag = false;
				break;
			}
			N = (N - N % 10) / 10;
		}

		if (N % 10 % 2 == 0) {
			flag = false;
		}

		return flag;
	}

}
