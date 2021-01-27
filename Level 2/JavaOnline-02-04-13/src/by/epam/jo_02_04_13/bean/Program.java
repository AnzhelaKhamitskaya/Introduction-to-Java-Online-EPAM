// ��� ������� ����� ���������� �����������, ���� ��� ���������� ���� �� ����� �� 2 (��������, 41 � 43).
// ����� � ���������� ��� ���� ���������� �� ������� [n,2n], ��� n - �������� ����������� ����� ������ 2. ���
// ������� ������ ������������ ������������.

package by.epam.jo_02_04_13.bean;

import java.util.ArrayList;
import java.util.List;

public class Program {
	
	 public static void main(String[] args) {

	       int n = 4;

	       List <String> list = getList(n);

	       System.out.println("��� ���� ���������� �� ������� [" + n + " ; " + (2 * n) + "]:");

	       printList(list);
	    }

	    private static void printList(List <String> list) {

	        if(list.isEmpty()){
	            System.out.print("�� ����������");
	        }
	        for (String element:
	             list) {
	            System.out.println(element + " ");
	        }
	    }

	    private static List<String> getList(int n) {

	        List <String> list = new ArrayList<>();

	        for(int i = n; (i < 2 * n +  1) && (i+2 < 2 * n +  1); i++){

	            String str = i + " � " + (i+2);
	            list.add(str);
	        }
	        return list;
	    }
}
