/*
 * ������ ������� �, � �������������� ��������� � ������� �, �, z �������. 
 * ����������, ������� �� ������ ����� ���������.
 */

package by.epam.jo_01_02_04.bean;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		double a = 0; 			//������ ���������
        double b = 0; 			//����� ���������
        double x = 0; 			//������ �������
        double y = 0; 			//����� �������
        double z = 0; 			//������� �������
        boolean flag = false;
        Scanner scanner;
        
        do {
            flag = true;

            scanner  = new Scanner(System.in);

            System.out.print("������� ������ ��������� ");

            if (scanner.hasNextDouble()){

                a = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("�������� ������!");

            }

        } while (!flag);


        do {
            flag = true;

            scanner  = new Scanner(System.in);

            System.out.print("������� ����� ��������� ");

            if (scanner.hasNextDouble()){

                b = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("�������� ������!");

            }

        } while (!flag);

        do {
            flag = true;

            scanner  = new Scanner(System.in);

            System.out.print("������� ������ ������� ");

            if (scanner.hasNextDouble()){

                x = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("�������� ������!");

            }

        } while (!flag);


        do {
            flag = true;

            scanner  = new Scanner(System.in);

            System.out.print("������� ����� ������� ");

            if (scanner.hasNextDouble()){

                y = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("�������� ������!");

            }

        } while (!flag);

        do {
            flag = true;

            scanner  = new Scanner(System.in);

            System.out.print("������� ������� ������� ");

            if (scanner.hasNextDouble()){

                z = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("�������� ������!");

            }

        } while (!flag);
        

        if (a >= x && b >= y || a >= y && b >= x || a >= y && b >= z || a >= z && b >= y || a >= x && b >= z || a >= z && b >= y) {

            System.out.println("�������");

        }
        else  {

            System.out.println("�� �������");

        }

        scanner.close();
	}

}
