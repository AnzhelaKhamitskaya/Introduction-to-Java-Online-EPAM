// Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
// Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
// решения задачи использовать декомпозицию.

package by.epam.jo_02_04_13.bean;

import java.util.ArrayList;
import java.util.List;

public class Program {
	
	 public static void main(String[] args) {

	       int n = 4;

	       List <String> list = getList(n);

	       System.out.println("Все пары «близнецов» из отрезка [" + n + " ; " + (2 * n) + "]:");

	       printList(list);
	    }

	    private static void printList(List <String> list) {

	        if(list.isEmpty()){
	            System.out.print("Не существует");
	        }
	        for (String element:
	             list) {
	            System.out.println(element + " ");
	        }
	    }

	    private static List<String> getList(int n) {

	        List <String> list = new ArrayList<>();

	        for(int i = n; (i < 2 * n +  1) && (i+2 < 2 * n +  1); i++){

	            String str = i + " и " + (i+2);
	            list.add(str);
	        }
	        return list;
	    }
}
