/*
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
 * Определить, пройдет ли кирпич через отверстие.
 */

package by.epam.jo_01_02_04.bean;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		double a = 0; 			//ширина отверстия
        double b = 0; 			//длина отверстия
        double x = 0; 			//ширина кирпича
        double y = 0; 			//длина кирпича
        double z = 0; 			//толщина кирпича
        boolean flag = false;
        Scanner scanner;
        
        do {
            flag = true;

            scanner  = new Scanner(System.in);

            System.out.print("Введите ширину отверстия ");

            if (scanner.hasNextDouble()){

                a = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("Неверный формат!");

            }

        } while (!flag);


        do {
            flag = true;

            scanner  = new Scanner(System.in);

            System.out.print("Введите длину отверстия ");

            if (scanner.hasNextDouble()){

                b = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("Неверный формат!");

            }

        } while (!flag);

        do {
            flag = true;

            scanner  = new Scanner(System.in);

            System.out.print("Введите ширину кирпича ");

            if (scanner.hasNextDouble()){

                x = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("Неверный формат!");

            }

        } while (!flag);


        do {
            flag = true;

            scanner  = new Scanner(System.in);

            System.out.print("Введите длину кирпича ");

            if (scanner.hasNextDouble()){

                y = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("Неверный формат!");

            }

        } while (!flag);

        do {
            flag = true;

            scanner  = new Scanner(System.in);

            System.out.print("Введите толщину кирпича ");

            if (scanner.hasNextDouble()){

                z = scanner.nextDouble();

            }else{

                flag = false;
                System.out.println("Неверный формат!");

            }

        } while (!flag);
        

        if (a >= x && b >= y || a >= y && b >= x || a >= y && b >= z || a >= z && b >= y || a >= x && b >= z || a >= z && b >= y) {

            System.out.println("пройдет");

        }
        else  {

            System.out.println("не пройдет");

        }

        scanner.close();
	}

}
