/*
 * ���� �������� ��� � ��������� ����� �. 
 * ����� ����� 
 * ��� ������ ����, 
 * ������ ������� 
 * ������ ��� ����� ��������� �
 */

package by.epam.jo_01_03_05.bean;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		double e = 0;
		double sum = 0;
		Scanner scanner;
		
		System.out.print("������ ��������� ����� ");

		scanner = new Scanner(System.in);
		e = scanner.nextDouble();
		scanner.close();
		
		if (e <= 0) {

			System.out.println("����� ���������� ������ ");

		} else {
			
			int i = 0;
			
			while(Math.abs(1.0 / Math.pow(2, i) + 1.0 / Math.pow(3, i)) >= e) {
				
				sum += Math.abs(1.0 / Math.pow(2, i) + 1.0 / Math.pow(3, i));
				i++;
			}
			
			
			if(sum > 0) {
				
				System.out.printf("����� ����� %f", sum);
				
			}else {
				
				System.out.printf("��� ����� ������");
				
			}
		}
	}
}
