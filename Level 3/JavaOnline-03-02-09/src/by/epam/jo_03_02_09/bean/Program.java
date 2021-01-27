/*
 * Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
 * буквы.
 */

package by.epam.jo_03_02_09.bean;

public class Program {

	public static void main(String[] args) {

		String str = "hhh рлЛрОРЛОр Retro РррррР КАК Q";

		System.out.println(getQuantity(str));
	}

	private static StringBuilder getQuantity(String str) {

		int quantity1 = 0;
		int quantity2 = 0;

		for (int i = 0; i < str.length(); i++) {

			char currentChar = str.charAt(i);
			
			if (currentChar < 91 && currentChar > 64)
				quantity1++;
			else if (currentChar < 123 && currentChar > 96)
				quantity2++;

		}

		StringBuilder result = new StringBuilder("Строчные " + quantity1 + " Прописные " + quantity2);

		return result;
	}
}
