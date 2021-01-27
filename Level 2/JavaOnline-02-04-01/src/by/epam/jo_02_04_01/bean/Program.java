/*
 * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
 * натуральных чисел
 */
package by.epam.jo_02_04_01.bean;

public class Program {

	public static void main(String[] args) {

		int nok = nok(100, 10);
		int nod = nod(100, 10);

		System.out.println("НОД = " + nod);
		System.out.println("НОК = " + nok);
	}

	private static int nod(int x, int y) {

		while (x != 0 && y != 0) {

			if (x > y) {

				x %= y;

			} else {

				y %= x;

			}
		}
		return x + y;
	}

	private static int nok(int x, int y) {

		return (x * y) / nod(x, y);
	}

}
