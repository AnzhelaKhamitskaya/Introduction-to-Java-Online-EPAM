/*
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
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

            System.out.print("Введите координату точки A x1 ");

            if (scanner.hasNextDouble()){

                x1 = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("Неверный формат!");

            }

        } while (!flag);


        do {
            flag = true;

            scanner  = new Scanner(System.in);

            System.out.print("Введите координату точки A y1 ");

            if (scanner.hasNextDouble()){

                y1 = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("Неверный формат!");

            }

        } while (!flag);

        do {
            flag = true;

            scanner  = new Scanner(System.in);

            System.out.print("Введите координату точки B x2 ");

            if (scanner.hasNextDouble()){

                x2 = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("Неверный формат!");

            }

        } while (!flag);


        do {
            flag = true;

           scanner  = new Scanner(System.in);

            System.out.print("Введите координату точки B y2 ");

            if (scanner.hasNextDouble()){

                y2 = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("Неверный формат!");

            }

        } while (!flag);

        do {
            flag = true;

            scanner  = new Scanner(System.in);

            System.out.print("Введите координату точки C x3 ");

            if (scanner.hasNextDouble()){

                x3 = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("Неверный формат!");

            }

        } while (!flag);


        do {
            flag = true;

            scanner  = new Scanner(System.in);

            System.out.print("Введите координату точки C y3 ");

            if (scanner.hasNextDouble()){

                y3 = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("Неверный формат!");

            }

        } while (!flag);

        if ((x2 - x1) * (y3-y1) - (y2 - y1) * (x3-x1) == 0){

            System.out.println("Точки лежат на одной прямой");

        } else {

            System.out.println("Точки не лежат на одной прямой");
        }
        
        scanner.close();
	}

}
