/* 
 * Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
 */

package by.epam.jo_03_02_01.bean;

public class Program {

	public static void main(String[] args) {

		String str = " k  k    ";

		System.out.println(getQuantityWhitespace(str));

	}

	private static int getQuantityWhitespace(String str) {

		int maxQuantityWhitespace = 0;

		int quantityWhitespace = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ') {
				quantityWhitespace++;
			}

			if (str.charAt(i) != ' ' || i == str.length() - 1) {
				if (maxQuantityWhitespace < quantityWhitespace) {
					maxQuantityWhitespace = quantityWhitespace;
				}

				quantityWhitespace = 0;
			}

		}

		return maxQuantityWhitespace;
	}

}
