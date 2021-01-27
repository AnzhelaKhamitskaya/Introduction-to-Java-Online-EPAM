/*
 * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
 * длинных слов может быть несколько, не обрабатывать.
 */

package by.epam.jo_03_02_08.bean;

public class Program {

	public static void main(String[] args) {

		String str = "мама папа органайзер верёвка я ты";

		System.out.println(getBigWord(str));
	}

	private static String getBigWord(String str) {

		StringBuilder strBld = new StringBuilder(str);

		StringBuilder word = new StringBuilder();
		StringBuilder maxWord = new StringBuilder();

		for (int i = 0; i < strBld.length(); i++) {

			if (!Character.isWhitespace(strBld.charAt(i))) {
				word = word.append(strBld.charAt(i));
				continue;
			}

			if (word.length() > maxWord.length()) {
				maxWord = word;
			}

			word = new StringBuilder();

		}

		if (word.length() > maxWord.length()) {
			maxWord = word;
		}

		return maxWord.toString();
	}
}
