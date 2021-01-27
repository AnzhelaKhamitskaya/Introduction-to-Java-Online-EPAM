/*
 * В строке найти количество цифр  
 */

package by.epam.jo_03_01_03.bean;

public class Program {

	 public static void main(String[] args) {

	        String str = "wor1d KHjf2345jnjjf 6 lnblgb00 WORD ldkjglk k 8925655 lkdg word nfgjfklg word";

	        System.out.println(getNumber(str));

	    }

	    private static int getNumber(String str) {

	        char[] arr = str.toCharArray();

	        int counter = 0;

	        for (int i = 0; i < arr.length; i++){
	        	
	            if(isDigit(arr[i])){
	            	
	                counter++;
	            }
	        }

	        return counter;
	    }

	    private static boolean isDigit(char c) {
	    	
	        return ((int) c >= 48 && (int) c <= 57);
	    }
}
