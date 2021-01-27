/*
 * В строке найти количество чисел.
 */

package by.epam.jo_03_01_04.bean;

public class Program {

	public static void main(String[] args) {

        String str = "00 00 wor1d KHjf2345jnjjf 6 lnblgb00 WORD ldkjglk k 8925655 lkdg word nfgjfklg word456 5";

        System.out.println(getNumber(str));

    }

    private static int getNumber(String str) {

        char[] arr = str.toCharArray();

        int counter = 0;

        for (int i = 0; i < arr.length-1; i++){
        	
            if(isDigit(arr[i]) && !isDigit(arr[i+1])){
            	
                counter++;
            }
        }

        return counter;
    }

    private static boolean isDigit(char c) {
    	
        return ((int) c >= 48 && (int) c <= 57);
    }

}
