// Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр

package by.epam.jo_02_04_11.bean;

public class Program {

	public static void main(String[] args) {

		int N1 = 50000;
		int N2 = 3255;

		int q1 = getQ(N1);
		int q2 = getQ(N2);

		printResult(N1, N2, q1, q2);

	}

	private static int getQ(int N) {
		int n = N;
		int q = 1;

		while (n / 10 > 0) {
			n = (n - n % 10) / 10;
			q++;
		}
		return q;
	}

	public static void printResult(int N1, int N2, int q1, int q2) {
		System.out.print("Больше цифр в числе ");
		if (q1 > q2) {
			System.out.print(N1);
		} else {
			System.out.print(N2);
		}
	}
}
