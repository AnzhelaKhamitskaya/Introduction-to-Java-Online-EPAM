/*
 * Из заданной строки получить новую, повторив каждый символ дважды.
 */
package by.epam.jo_03_02_06.bean;

public class Program {

	public static void main(String[] args) {

		String str = "я люблю тебя";

		System.out.println(getStr(str));
	}

	private static String getStr(String str) {

		StringBuilder strBld = new StringBuilder(str);

		for (int i = 0; i < strBld.length(); i += 2) {

			strBld.insert(i + 1, strBld.charAt(i));

		}

		return strBld.toString();
	}
}
