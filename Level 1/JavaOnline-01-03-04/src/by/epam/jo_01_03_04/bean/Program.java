/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел
 */

package by.epam.jo_01_03_04.bean;

import java.math.BigInteger;

public class Program {

	public static void main(String[] args) {

		final int NUMBER = 200;

		BigInteger multOfSqrt = BigInteger.valueOf(1);

		for (int i = 2; i <= NUMBER; i++) {

			multOfSqrt = multOfSqrt.multiply(BigInteger.valueOf(i * i));

		}
		
			System.out.println("Произведение квадратов первых 200 чисел равно " + multOfSqrt);

	}

}
