/*
 * ƒаны дроби.
 * —оставить программу, котора€ приводит эти дроби к общему знаменателю и упор€дочивает их в пор€дке возрастани€.
 */

package by.epam.jo_02_03_08.bean;

public class Program {

	public static void main(String[] args) {
		
		int[] numerators = new int[] { 5, 4, 2, 6, 7, 0 };
		int[] denominators = new int[] { 2, 1, 3, 4, 4, 10 };
		int[] arr_temp = new int[numerators.length];

		for (int i = 0; i < numerators.length; i++) {

			System.out.print(numerators[i] + "/" + denominators[i] + " ");
		}

		int common_denominator = 1;

		for (int i = 0; i < denominators.length; i++) {
			
			common_denominator *= denominators[i];
		}

		System.out.println("\n" + common_denominator);

		for (int i = 0; i < arr_temp.length; i++) {
			
			arr_temp[i] = common_denominator / denominators[i] * numerators[i];
			System.out.print(arr_temp[i] + "/" + common_denominator + " ");
			
		}

		for (int i = 0; i < arr_temp.length - 1; i++) {

			if (arr_temp[i] > arr_temp[i + 1]) {
				
				int temp = arr_temp[i];
				arr_temp[i] = arr_temp[i + 1];
				arr_temp[i + 1] = temp;

				temp = numerators[i];
				numerators[i] = numerators[i + 1];
				numerators[i + 1] = temp;

				temp = denominators[i];
				denominators[i] = denominators[i + 1];
				denominators[i + 1] = temp;

				i = i == 0 ? 0 : i - 2;
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < numerators.length; i++) {

			System.out.print(numerators[i] + "/" + denominators[i] + " ");
		}

	}

}
