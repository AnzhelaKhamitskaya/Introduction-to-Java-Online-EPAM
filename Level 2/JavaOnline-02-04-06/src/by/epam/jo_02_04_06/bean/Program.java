// Ќаписать метод(методы), провер€ющий, €вл€ютс€ ли данные три числа взаимно простыми.

package by.epam.jo_02_04_06.bean;

public class Program {
	public static void main(String[] args) {

		int[] arr = new int[] { 3, 2 };

		printAnswer(arr);

	}

	private static int nod(int x, int y) {
		while (x != 0 && y != 0) {
			if (x > y) {
				x %= y;
			} else {
				y %= x;
			}
		}
		return x + y;
	}

	public static boolean getAnswer(int[] arr) {

		boolean answer = true;

		for (int i = 0; i < arr.length - 1; i++) {

			if (nod(arr[i], arr[i + 1]) != 1) {
				answer = false;
			}
		}

		return answer;
	}

	public static void printAnswer(int[] arr) {

		Boolean answer = getAnswer(arr);

		if (answer) {
			System.out.print("„исла €вл€ютс€ взаимнопростыми");
		} else {
			System.out.print("„исла не €вл€ютс€ взаимнопростыми");
		}
	}
}
