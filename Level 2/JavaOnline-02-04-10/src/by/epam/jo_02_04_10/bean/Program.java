// Äàíî íàòóğàëüíîå ÷èñëî N. Íàïèñàòü ìåòîä(ìåòîäû) äëÿ ôîğìèğîâàíèÿ ìàññèâà, ıëåìåíòàìè êîòîğîãî
// ÿâëÿşòñÿ öèôğû ÷èñëà N.

package by.epam.jo_02_04_10.bean;

public class Program {

	public static void main(String[] args) {

		int N = 158965;

		int[] arr = getArr(getLength(N), N);

		printArr(arr);
	}

	private static void printArr(int[] arr) {

		for (int element : arr) {
			System.out.print(element + " ");
		}
	}

	private static int[] getArr(int length, int n) {

		int k = length;
		int N = n;

		int[] arr = new int[k];

		for (; k > 0; k--) {
			arr[k - 1] = N % 10;
			N = (N - N % 10) / 10;
		}

		return arr;
	}

	private static int getLength(int n) {
		int k = 1;

		int N = n;

		while (N / 10 > 0) {
			k++;
			N = (N - N % 10) / 10;
		}

		return k;
	}
}
