/*
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

package by.epam.jo_02_02_01.bean;

public class Program {

	public static void main(String[] args) {

		int[][] myArr = new int[5][6];
        myArr[0] = new int [] {6, 3, 5, 0, 9, 0 };
        myArr[1] = new int [] {2, 0, 0, 3, 5, 0 };
        myArr[2] = new int [] {5, 0, 0, 0, 5, 0 };
        myArr[3] = new int [] {3, 0, 0, 4, 5, 0 };
        myArr[4] = new int [] {3, 0, 0, 0, 5, 9 };



        for (int r = 0; r < myArr.length; r++) {

                 for (int c = 0; c < myArr[0].length; c += 2){

                   if (myArr[0][c] > myArr[myArr.length-1][c]) {

                    System.out.print(myArr[r][c] + " ");

                   }

                 }

           System.out.println();

        }
	}
}
