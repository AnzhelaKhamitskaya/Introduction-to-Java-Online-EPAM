/*
 *  Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
 */

package by.epam.jo_02_02_13.bean;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		int r = 6;
        int c = 5;

        int [][] myArray = new int[r][c];
        System.out.println("Исходный массив");
        
        for(int i = 0; i < r; i++){
        	
            for(int j = 0; j < c; j++) {
            	
                myArray[i][j] = (int)(Math.random()*10);
                System.out.print(myArray[i][j] + " ");
            }

            System.out.println();
        }


        for (int j = 0; j < c; j++) {

            int[] arr = new int[r];

            for (int i = 0; i < r; i++) {

                arr[i] = myArray[i][j]  ;

            }

            Arrays.sort(arr);

            for (int i = 0; i < r; i++) {

                myArray[i][j] = arr[i];

            }
        }

        System.out.println("Отсортированный массив по возрастанию значений элементов в столбцах");

        for (int i = 0; i < r; i++){

            for (int j = 0; j < c; j++){

                System.out.print(myArray[i][j] + " ");
            }

            System.out.println();
        }



        for (int j = 0; j < c; j++) {

            for (int i = 0, k = r-1; i < k ; i++, k--) {

                int l = myArray[i][j];
                myArray[i][j] = myArray[k][j];
                myArray[k][j]  = l;
            }
        }

        System.out.println("Отсортированный массив по убыванию значений элементов в столбцах");

        for (int i = 0; i < r; i++){

            for (int j = 0; j < c; j++){

                System.out.print(myArray[i][j] + " ");
            }

            System.out.println();
        }

	}

}
