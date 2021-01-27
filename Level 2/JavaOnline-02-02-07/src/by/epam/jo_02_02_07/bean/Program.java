
/*
 *  —формировать квадратную матрицу по правилу и подсчитать количество положительных элементов в ней
 */

package by.epam.jo_02_02_07.bean;

public class Program {

	public static void main(String[] args) {
		
		  int n = 3;
	       
	       int sum = 0;
	       
	        double[][] myArray = new double[n][n];

	        for(int i = 0; i < n; i++){

	            for(int j = 0; j < n; j++){

	                System.out.print((myArray[i][j] = Math.sin((Math.pow(i, 2.0) - Math.pow(j,2.0))/ n)) + " ");

	                    if(myArray[i][j] > 0){
	                        sum++;
	                    }
	            }
	            
	                System.out.println();
	        }

	        System.out.print(" оличество положительных элементов в матрице Ч " + sum);
	}

}
