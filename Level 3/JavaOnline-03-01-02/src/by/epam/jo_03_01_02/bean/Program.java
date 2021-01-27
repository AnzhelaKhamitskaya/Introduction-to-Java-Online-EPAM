/*
 * Замените в строке все вхождения 'word' на 'letter'.
 */

package by.epam.jo_03_01_02.bean;

public class Program {

	public static void main(String[] args) {

		String from = "word";
		String to = "letter";

		String str = "word KHjfjnjjf lnblgb WORD ldkjglk k 256 lkdg word nfgjfklg word";

		System.out.println(getReplace(str, from, to));

	}

	private static String getReplace(String str, String from, String to) {

		String[] arr = str.split(" ");
		String newStr = "";

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(from)) {
				arr[i] = to;
			}

			newStr += arr[i] + " ";
		}

		return newStr;
	}

}
