/*
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. 
 * Заменить все ее члены, большие данного Z, этим числом. 
 * Подсчитать количество замен.
 */
package by.epam.jo_02_01_02.bean;
import static java.lang.System.*;

public class Program {

	public static void main(String[] args) {
		
        final int Z = 28;
        int quantity = 0;

    	int[] array = new int[] {1, 15, 20, 16, 110, 30, 120};

        for(int i = 0; i < array.length; i++) {

            if(array[i] > Z){
            	
                array[i] = Z;
                quantity++;                
            }
        }

        out.println(quantity);
	}
}
