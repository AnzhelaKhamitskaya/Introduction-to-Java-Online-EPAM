/*
 * Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ..., 2n так, 
 * что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны междусобой. 
 * Построить такой квадрат. 
 * Пример магического квадрата порядка 3:
 * 6 1 8
 * 7 5 3
 * 2 9 4
 */

package by.epam.jo_02_02_16.bean;

import java.util.Scanner;

public class Program {

	//Печать матрицы
    public  static void Print(int[][] array){

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");

            }

            System.out.println();
        }
    }
    
    //Печать результатов проверки
    private static void PrintResult(int[][] array) {

        System.out.println();
        System.out.println("Сумма значений элементов в кажой строке");
        for (int i = 0; i < array.length; i++) {

            int sum = 0;

            for (int j = 0; j < array[i].length; j++) {

                sum += array[i][j];

            }
            System.out.println((i + 1) + " - " + sum);
        }


        System.out.println("Сумма значений элементов в кажом столбце");
        for (int i = 0; i < array.length; i++) {

            int sum = 0;

            for (int j = 0; j < array[i].length; j++) {

                sum += array[j][i];

            }
            System.out.println((i + 1) + " - " + sum);
        }

        System.out.print("Сумма значений элементов по диагонали №1:");
        int sum = 0;
        for (int i = 0, j = 0; i < array.length && j >= 0; i++, j++) {
            sum += array[i][j];
        }
        
        System.out.println(sum);

        System.out.print("Сумма значений элементов по диагонали №2: ");
        int sum2 = 0;
        for (int i = 0, j = array.length-1; i < array.length && j >=0 ; i++, j--) {
            sum2 += array[i][j];
        }
        System.out.println(sum2);

    }

    public static void main(String[] args) {

        //Флаг, регулирующий ввод данных с клавиатуры пользователем
        boolean flag = false;
        //Ранг матрицы
        int rang = 0;


        //Ввод данных (ранга) с клавиатуры пользователем
        do {
            System.out.print("Введите порядок квадратной матрицы больше 2: ");

            Scanner scanner = new Scanner(System.in);

            if (scanner.hasNextInt()) {

                rang = scanner.nextInt();

                if (rang < 3) {

                    System.out.println("Ошибка: число меньше или равно 2");

                } else {

                    flag = true;
                    scanner.close();
                }

            } else {

                System.out.println("Ошибка: неверный формат");

            }

        } while (!flag);

        //Матрица магического квадрата
        int[][] myArray = new int[rang][rang];

        //Введен нечётный ранг
        if (rang % 2 > 0) {

            System.out.println("Магический квадрат нечётного порядка " + rang);

            int row = 0;

            int column = rang / 2;

            for (int k = 1; k <= Math.pow(rang, 2); k++) {

                myArray[row][column] = k;

                if (k % rang == 0) {

                    row++;

                }
                else {

                    row--;

                    if (row < 0) row = rang - 1;

                    column++;

                    if (column > rang - 1) column = 0;

                }
            }
        }
        //Введен четный ранг кратный 4
        else if (rang % 4 == 0) {

            System.out.println("Магический квадрат четного порядка двойной точности: " + rang);

            //вспомогательная матрица №1
            int[][] myArray_1 = new int[rang][rang];
            //вспомогательная матрица №2
            int[][] myArray_2 = new int[rang][rang];

            //значение элемента матрицы
            int k = 0;

            //заполнение матрицы №1 от 1 до rang2
            for (int i_1 = 0; i_1 < rang; i_1++) {

                for (int j_1 = 0; j_1 < rang; j_1++) {

                    myArray_1[i_1][j_1] = ++k;

                }
            }

            //заполнение матрицы №2 от rang2 до 1
            for (int i_2 = 0; i_2 < rang; i_2++) {

                for (int j_2 = 0; j_2 < rang; j_2++) {

                    myArray_2[i_2][j_2] = k--;

                }
            }

            //замена значений в матрица №1 по диагоналям на нули
            for (int x = 0; x < rang; x += 4) {     //координата x левого верхнего угла текущего маленького квадрата в сетке большого
                for (int y = 0; y < rang; y += 4) { //координата y левого верхнего угла текущего маленького квадрата в сетке большого

                    //диагональ №1 малых квадратов
                    for (int i = x, l = 0; i < (x + 4); i++, l++) { //перебор строк маленького квадрата в сетке большого
                        for (int j = y, m = 0; j < (y + 4); j++, m++) { //перебор столбцов маленького квадрата в сетке большого

                            if (l == m) {

                                myArray_1[i][j] = 0;
                            }
                        }
                    }

                    //диагональ №2 малых квадратов
                    for (int i = x, l = 0; i < (x + 4); i++, l++) { //перебор строк маленького квадрата в сетке большого
                        for (int j = y + 3, m = 4; j >= y; j--, m--) { //перебор столбцов маленького квадрата в сетке большого

                            if ((m + l) == 4) {
                                myArray_1[i][j] = 0;
                            }
                        }
                    }
                }
            }

            //замена значений в матрица №2 (кроме значений по диагоналям) на нули
            for (int i = 0; i < rang; i++) {
                for (int j = 0; j < rang; j++) {
                    if (myArray_1[i][j] != 0) {
                        myArray_2[i][j] = 0;
                    }
                }
            }

            //магический квадрат (сложение двух вспомогательных матриц)
            for (int i = 0; i < rang; i++) {

                for (int j = 0; j < rang; j++) {

                    myArray[i][j] = myArray_1[i][j] + myArray_2[i][j];

                    System.out.print(myArray[i][j] + " ");

                }
                System.out.println();
            }

        }
        //Введен четный ранг некратный 4
        else{

            int rang_ = rang/2;
            //Вспомогательная матрица малого квадрата
            int[][] arr = new int[rang_][rang_];

            //Создание магического квадрата с рангом малого квадрата
            int row = 0;

            int column_ = rang_/2;

            for (int k = 1; k <= Math.pow(rang_, 2); k++) {

                arr[row][column_] = k;

                if (k % rang_ == 0) {

                    row++;

                }
                else {

                    row--;

                    if (row < 0) row = rang_ - 1;

                    column_++;

                    if (column_ > rang_ - 1) column_ = 0;

                }
            }

            System.out.println();
            Print(arr);

            //Заполнение 1 малого квадрата
            for (int i = 0; i < rang/2; i++) {

                for (int j = 0; j <rang/2; j++) {

                    myArray[i][j] = arr[i][j];

                }
            }

            System.out.println();
            Print(myArray);

            //Заполнение 2, 3, 4 малого квадрата
            int number = 0; //номер квадрата

            for (int x = 0; x < rang; x += rang / 2) {

                for (int y = 0; y < rang; y += rang / 2) {

                    if (x == 0 && y == 0) continue;
                    else if (x == 0 && y != 0) number = 2;
                    else if (x == rang/2 && y == 0) number = 3;
                    else if (x == rang/2 && y != 0) number = 1;

                    for (int i = x, i_ = 0; i < (x + rang / 2); i++, i_++) {

                        for (int j = y, j_ = 0; j < (y + rang / 2); j++, j_++) {

                            myArray[i][j] = arr[i_][j_] + number * rang / 2 * rang / 2;

                        }
                    }
                }
            }

            System.out.println();
            Print(myArray);

            //Обмен значений по вертикальной центральной оси
            int q = rang / 2 - 3;

            if (q > 0) {


                q /= 2;
                for (int j = rang / 2 - q; j <= rang / 2 + q - 1; j++) {

                    for (int i = 0, i_ = rang / 2; i < rang / 2; i++, i_++) {

                        int z = myArray[i][j];

                        myArray[i][j] = myArray[i_][j];

                        myArray[i_][j] = z;

                    }
                }
            }

            System.out.println();
            Print(myArray);

            //Обмен значений по кривой
            for (int i = 0; i < rang / 2; i++) {

                if (i < 2) {

                    int z = myArray[i][i];

                    myArray[i][i] = myArray[i + rang / 2][i];

                    myArray[i + rang / 2][i] = z;

                }
                else if (i < rang / 2 - 1) {

                    for (int j = 1; j < 2; j++) {

                        int z = myArray[i][j];

                        myArray[i][j] = myArray[i + rang / 2][j];

                        myArray[i + rang / 2][j] = z;

                    }
                }
                else {

                    int z = myArray[i][0];

                    myArray[i][0] = myArray[i + rang / 2][0];

                    myArray[i + rang / 2][0] = z;

                }
            }
        }

        System.out.println();
        Print(myArray);
        System.out.println();
        PrintResult(myArray);
    }	
}
	


