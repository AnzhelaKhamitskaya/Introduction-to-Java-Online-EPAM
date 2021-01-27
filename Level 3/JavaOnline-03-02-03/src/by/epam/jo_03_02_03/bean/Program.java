/*
 * В строке вставить после каждого символа 'a' символ 'b'.
 */

package by.epam.jo_03_02_03.bean;

public class Program {

	public static void main(String[] args) {

		String str = "ffff    ";

		System.out.println(getAnswer(str));
	}

	private static boolean getAnswer(String str) {

		StringBuilder stringBuilder = new StringBuilder(str.trim());

		return str.trim().equals(stringBuilder.reverse().toString());
	}

}
