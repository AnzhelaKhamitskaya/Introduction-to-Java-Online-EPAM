/*
 * Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 */
package by.epam.jo_03_02_05.bean;

public class Program {

	 public static void main(String[] args) {

	       String str  = "а оаоаодлдлдлдлддлдaaa";

	       System.out.println(getCake(str));
	    }

	    private static int getCake(String str) {

	        int quantity = 0;
	        String str_ = str.trim();
	        for (int i = 0; i < str_.length(); i++)
	        {
	            if(str_.charAt(i)== 'a' || str_.charAt(i)== 'а'){
	                quantity++;
	            }
	        }

	        return quantity;
	    }
}
