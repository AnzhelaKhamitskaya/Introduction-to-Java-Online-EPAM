/*
 * Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
 * знаком. Определить количество предложений в строке X.
 */

package by.epam.jo_03_02_10.bean;

public class Program {

	public static void main(String[] args) {

		String str = "J[! Рпрпр hhhППапап  папапап  ��������апапа Retro как  папап ��������� Q. апапапапапап? апапапапапап?";

		System.out.println("Количество предложений в строке =" + getQuantity(str));
	}

	private static int getQuantity(String str) {

		int qttSentences = 0;

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (currentChar == '.' || currentChar == '!' || currentChar == '?')
				qttSentences++;
		}
		return qttSentences;
	}
}
