/*
 * Вводится строка. 
 * Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cdedef", 
 * то должно быть выведено "abcdef".
 */

package by.epam.jo_03_02_07.bean;

public class Program {
	public static void main(String[] args) {

		String str = " abcdefigh i";

		System.out.println(getStr(str));
	}

	private static String getStr(String str) {

		StringBuilder strBld = new StringBuilder(str.trim());

		strBld = delWhiteSpace(strBld);

		for (int i = 0; i < strBld.length(); i++) {

			if (strBld.indexOf(String.valueOf(strBld.charAt(i))) != strBld
					.lastIndexOf(String.valueOf(strBld.charAt(i)))) {
				strBld.deleteCharAt(strBld.lastIndexOf(String.valueOf(strBld.charAt(i))));
				i -= 2;
			}

		}

		return strBld.toString();
	}

	private static StringBuilder delWhiteSpace(StringBuilder strBld) {

		for (int i = 0; i < strBld.length(); i++) {

			if (Character.isWhitespace(strBld.charAt(i))) {
				strBld.deleteCharAt(i);
			}
		}
		return strBld;
	}
}
