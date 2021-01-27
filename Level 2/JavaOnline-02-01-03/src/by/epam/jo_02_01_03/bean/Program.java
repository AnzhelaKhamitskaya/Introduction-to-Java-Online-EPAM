/*
 * ƒан массив действительных чисел, размерность которого N.
 * ѕодсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */
package by.epam.jo_02_01_03.bean;

import static java.lang.System.*;

public class Program {

	public static void main(String[] args) {
		
		int quantityPositiv = 0;
        int quantityNegativ = 0;
        int quantityZero = 0;

        int[] array = {-50, 5, 0, -123, 16, 18, 1, 0};

        for(int i = 0; i < array.length; i++) {

           if(array[i]>0){
        	   
                quantityPositiv++;
                
            }else if (array[i]<0){
            	
                quantityNegativ++;
                
            }else if(array[i]==0){
            	
                quantityZero++;
                
            } else{
            	
               out.println("Ќе число!");
               
           }
        }

        out.println(quantityPositiv);
        out.println(quantityNegativ);
        out.println(quantityZero);
	}
}
