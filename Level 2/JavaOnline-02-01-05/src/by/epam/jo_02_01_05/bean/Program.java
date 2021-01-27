/*
 *  Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */

package by.epam.jo_02_01_05.bean;

import static java.lang.System.*;

public class Program {

	public static void main(String[] args) {

		int[] array = {-5, -4, -3, 0, 4, 6, 7, 8};

        for(int i = 0; i < array.length; i++) {

            if (array[i] > i) {
                out.printf("%d ", array[i]);
            }

        }

	}
}
