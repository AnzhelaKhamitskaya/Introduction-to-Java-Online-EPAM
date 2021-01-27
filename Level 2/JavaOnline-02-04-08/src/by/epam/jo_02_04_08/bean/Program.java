//����� ������ D. ���������� ��������� �����: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//���������. ��������� �����(������) ��� ���������� ����� ���� ��������������� ������������� ���������
//������� � �������� �� k �� m

package by.epam.jo_02_04_08.bean;

public class Program {

	 public static void main(String[] args) {

	        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6};
	        int k = 0;
	        int m = arr.length - 1;
	        int quantity = 3;

	        printSum(arr, k, m, quantity);

	    }

	    private static void printSum(int[] arr, int k, int m, int quantity) {
	    	
	        int[] sum = getArrSum(arr, k, m, quantity);
	        
	        System.out.print(" ");
	        
	        for (int value: sum) {
	            System.out.print(value + " ");
	        }
	    }

	    private static int[] getArrSum(int[] arr, int k, int m, int quantity) {
	    	
	    	if(k >= arr.length) {
	    		return new int[] {};
	    	}
	        int[] arrSum = new int[(m - k + 1) / 3]; //������ � �����������
	        int sum = 0; // ������ ����� ��� �����
	        int iterator = quantity; // ������� ��� �����
	        int i = k; //������ �������� �������� �������
	        int j = 0; //������ �������� ������� � �����������

	        while (j < arrSum.length) {

	            for (; iterator > 0; iterator--, i++) {
	                sum += arr[i];
	            }

	            arrSum[j] = sum;

	            sum = 0;
	            iterator = 3;
	            j++;
	        }

	        return arrSum;
	    }

}
