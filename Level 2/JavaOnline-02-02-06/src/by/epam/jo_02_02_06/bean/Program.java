/*
 * —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное)
 */

package by.epam.jo_02_02_06.bean;

public class Program {

	public static void main(String[] args) {
		int n = 5;

        int[][] myArray = new int[n][n];

        int e1 = -1;
        int e2 = n;

        for(int i = 0; i < n/2; i++){

                for(int j = 0; j < n; j++){

                    if(j>e1 && j < e2){

                        myArray[i][j] = 1;

                    }else{

                        myArray[i][j] = 0;

                    }
                    System.out.print(myArray[i][j]+ " ");
                }

            e1++;
            e2--;

            System.out.println();
        }

        e1--;
        e2++;

        for(int i = n/2; i < n; i++){

            for(int j = 0; j < n; j++){

                if(j>e1 && j<e2){

                    myArray[i][j] = 1;

                }else{

                    myArray[i][j] = 0;

                }
                System.out.print(myArray[i][j]+ " ");
            }

            e1--;
            e2++;

            System.out.println();
        }

	}

}
