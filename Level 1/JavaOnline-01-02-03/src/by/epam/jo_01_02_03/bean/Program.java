/*
 * ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� �� ����� ������.
 */

package by.epam.jo_01_02_03.bean;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		double x1 = 0;
        double y1 = 0;
        double x2 = 0;
        double y2 = 0;
        double x3 = 0;
        double y3 = 0;
        boolean flag = false;
        Scanner scanner;
        do {
            flag = true;

            scanner  = new Scanner(System.in);

            System.out.print("������� ���������� ����� A x1 ");

            if (scanner.hasNextDouble()){

                x1 = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("�������� ������!");

            }

        } while (!flag);


        do {
            flag = true;

            scanner  = new Scanner(System.in);

            System.out.print("������� ���������� ����� A y1 ");

            if (scanner.hasNextDouble()){

                y1 = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("�������� ������!");

            }

        } while (!flag);

        do {
            flag = true;

            scanner  = new Scanner(System.in);

            System.out.print("������� ���������� ����� B x2 ");

            if (scanner.hasNextDouble()){

                x2 = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("�������� ������!");

            }

        } while (!flag);


        do {
            flag = true;

           scanner  = new Scanner(System.in);

            System.out.print("������� ���������� ����� B y2 ");

            if (scanner.hasNextDouble()){

                y2 = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("�������� ������!");

            }

        } while (!flag);

        do {
            flag = true;

            scanner  = new Scanner(System.in);

            System.out.print("������� ���������� ����� C x3 ");

            if (scanner.hasNextDouble()){

                x3 = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("�������� ������!");

            }

        } while (!flag);


        do {
            flag = true;

            scanner  = new Scanner(System.in);

            System.out.print("������� ���������� ����� C y3 ");

            if (scanner.hasNextDouble()){

                y3 = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("�������� ������!");

            }

        } while (!flag);

        if ((x2 - x1) * (y3-y1) - (y2 - y1) * (x3-x1) == 0){

            System.out.println("����� ����� �� ����� ������");

        } else {

            System.out.println("����� �� ����� �� ����� ������");
        }
        
        scanner.close();
	}

}
