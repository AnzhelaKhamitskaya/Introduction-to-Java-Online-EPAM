/*
 * Даны действительные числа a1, a2, a3, ..., a9
 * Найти max(a1+a2n, a2+an-1, ..., an+a2n+1)
 */

package by.epam.jo_02_01_07.bean;

import static java.lang.System.*;

public class Program {

	public static void main(String[] args) {

		double maxExpression;
		double expression;
		double[] array = { -5.0, -4.1, 200, 0.0, 4.2, 6.9, 7.0, 8.9, 123, 0.3 };

		maxExpression = array[0] + array[array.length - 1];

		for (int i = 1; i < array.length / 2; i++) {

			expression = array[i] + array[array.length - i - 1];

			if (expression > maxExpression) {
				maxExpression = expression;
			}
		}

		out.println(maxExpression);
	}
}