/*
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

package by.epam.jo_01_03_06.bean;

public class Program {

	public static void main(String[] args) {
		
		for (int simbol = 0; simbol <= 256 ; simbol++) {

            System.out.printf("Код %3d \t Символ %c \n", simbol, simbol);

        }
		
	}

}
