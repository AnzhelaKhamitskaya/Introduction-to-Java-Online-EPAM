/*
 * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
 * Крайние пробелы в строке удалить.
 */

package by.epam.jo_03_01_05.bean;

public class Program {

	public static void main(String[] args) {

		String str = " dgd fdgdf sgsgg   sfsgs sg ";
		System.out.println("Str= \"" + str + "\" Length=" + str.length());

		if (!str.isEmpty()) {

			str = strWithoutOddSpace(str);
		}

		System.out.println("Str= \"" + str + "\" Length=" + str.length());
	}

	private static String strWithoutOddSpace(String str) {

		char[] arr = str.toCharArray();

		if (arr.length == 1 && Character.isWhitespace(arr[0])) {

			return new String();

		} else if (arr.length == 1 && !Character.isWhitespace(arr[0])) {

			return str;
		}

		char[] newArr = new char[arr.length];

		int ch = 0;

		while (Character.isWhitespace(arr[ch])) {
			ch++;
		}

		int counter = 0;

		for (int i = ch, j = 0; i < arr.length; i++) {

			if (!Character.isWhitespace(arr[i])
					|| (Character.isWhitespace(arr[i]) && i < arr.length - 1 && !Character.isWhitespace(arr[i + 1]))) {

				newArr[j] = arr[i];
				j++;

			}
		}

		for (int i = newArr.length - 1; i >= 0; i--) {
			if (newArr[i] == 0) {
				counter++;
			}

			if (!Character.isWhitespace(newArr[i - 1]) && newArr[i - 1] != 0) {
				break;
			}
		}

		arr = new char[newArr.length - counter];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = newArr[i];
		}

		return new String(arr);
	}

}
