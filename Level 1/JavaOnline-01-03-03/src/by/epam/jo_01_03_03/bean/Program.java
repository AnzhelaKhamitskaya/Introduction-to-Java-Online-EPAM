/*
 * Найти сумму квадратов первых ста чисел
 */

package by.epam.jo_01_03_03.bean;

import java.math.BigInteger;

public class Program {

	public static void main(String[] args) {

		final int NUMBER = 10000000;

		BigInteger sumOfSqrt = BigInteger.valueOf(1);;

		for (int i = 2; i <= NUMBER; i++) {
			
			sumOfSqrt = sumOfSqrt.add(BigInteger.valueOf(i * i));
		}
		
		System.out.println("Сумма квадратов первых 200 чисел равна " + sumOfSqrt);
	}

}
