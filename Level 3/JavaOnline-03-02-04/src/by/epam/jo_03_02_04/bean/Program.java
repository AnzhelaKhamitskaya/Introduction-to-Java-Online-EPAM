/*
 * С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */

package by.epam.jo_03_02_04.bean;

public class Program {

	public static void main(String[] args) {

		String str = "информатика";

		System.out.println(getCake(str));
	}

	private static String getCake(String str) {

		String stringBuilder = new String(String.copyValueOf(str.toCharArray(), 7, 1)
				+ String.copyValueOf(str.toCharArray(), 3, 2) + String.copyValueOf(str.toCharArray(), 7, 1));

		return stringBuilder;
	}
}
