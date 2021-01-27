/*
 * «адана последовательность N вещественных чисел.
 * ¬ычислить сумму чисел, пор€дковые номера которых €вл€ютс€ простыми числами
 */

package by.epam.jo_02_01_06.bean;

import static java.lang.System.*;

public class Program {

	public static void main(String[] args) {

		double sum = 0;
		
		double[] array = { -5.0, -4.1, -3.6, 0.0, 4.2, 6.9, 7.0, 8.9, 123 };

		for (int i = 2; i < array.length; i++) {

			if ((i + 1) % 2 != 0) {
				
				sum += array[i];
			}
		}

		out.println(sum);
	}
}
