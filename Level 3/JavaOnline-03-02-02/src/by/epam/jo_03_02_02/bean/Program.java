/* 
 * В строке вставить после каждого символа 'a' символ 'b'.
 */


package by.epam.jo_03_02_02.bean;

public class Program {

	public static void main(String[] args) {

		String str = " a a aa a a a aa ";

		System.out.println(getStrWithB(str));
	}

	private static String getStrWithB(String str) {

		StringBuilder stringBuilder = new StringBuilder(str);

		for (int i = 0; i < stringBuilder.length(); i++) {
			if (stringBuilder.charAt(i) == 'a') {
				stringBuilder.insert(i + 1, 'b');
				i++;
			}
		}

		return stringBuilder.toString();
	}
}
