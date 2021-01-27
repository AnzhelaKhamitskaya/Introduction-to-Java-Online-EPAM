/*
 * ���������� ��������� ������� n ���������� ���������� ������� ������� nxn, ������������ �� ����� 1, 2, 3, ..., 2n ���, 
 * ��� ����� �� ������� �������, ������ ������ � ������ �� ���� ������� ���������� ����� ����������. 
 * ��������� ����� �������. 
 * ������ ����������� �������� ������� 3:
 * 6 1 8
 * 7 5 3
 * 2 9 4
 */

package by.epam.jo_02_02_16.bean;

import java.util.Scanner;

public class Program {

	//������ �������
    public  static void Print(int[][] array){

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.print(array[i][j] + " ");

            }

            System.out.println();
        }
    }
    
    //������ ����������� ��������
    private static void PrintResult(int[][] array) {

        System.out.println();
        System.out.println("����� �������� ��������� � ����� ������");
        for (int i = 0; i < array.length; i++) {

            int sum = 0;

            for (int j = 0; j < array[i].length; j++) {

                sum += array[i][j];

            }
            System.out.println((i + 1) + " - " + sum);
        }


        System.out.println("����� �������� ��������� � ����� �������");
        for (int i = 0; i < array.length; i++) {

            int sum = 0;

            for (int j = 0; j < array[i].length; j++) {

                sum += array[j][i];

            }
            System.out.println((i + 1) + " - " + sum);
        }

        System.out.print("����� �������� ��������� �� ��������� �1:");
        int sum = 0;
        for (int i = 0, j = 0; i < array.length && j >= 0; i++, j++) {
            sum += array[i][j];
        }
        
        System.out.println(sum);

        System.out.print("����� �������� ��������� �� ��������� �2: ");
        int sum2 = 0;
        for (int i = 0, j = array.length-1; i < array.length && j >=0 ; i++, j--) {
            sum2 += array[i][j];
        }
        System.out.println(sum2);

    }

    public static void main(String[] args) {

        //����, ������������ ���� ������ � ���������� �������������
        boolean flag = false;
        //���� �������
        int rang = 0;


        //���� ������ (�����) � ���������� �������������
        do {
            System.out.print("������� ������� ���������� ������� ������ 2: ");

            Scanner scanner = new Scanner(System.in);

            if (scanner.hasNextInt()) {

                rang = scanner.nextInt();

                if (rang < 3) {

                    System.out.println("������: ����� ������ ��� ����� 2");

                } else {

                    flag = true;
                    scanner.close();
                }

            } else {

                System.out.println("������: �������� ������");

            }

        } while (!flag);

        //������� ����������� ��������
        int[][] myArray = new int[rang][rang];

        //������ �������� ����
        if (rang % 2 > 0) {

            System.out.println("���������� ������� ��������� ������� " + rang);

            int row = 0;

            int column = rang / 2;

            for (int k = 1; k <= Math.pow(rang, 2); k++) {

                myArray[row][column] = k;

                if (k % rang == 0) {

                    row++;

                }
                else {

                    row--;

                    if (row < 0) row = rang - 1;

                    column++;

                    if (column > rang - 1) column = 0;

                }
            }
        }
        //������ ������ ���� ������� 4
        else if (rang % 4 == 0) {

            System.out.println("���������� ������� ������� ������� ������� ��������: " + rang);

            //��������������� ������� �1
            int[][] myArray_1 = new int[rang][rang];
            //��������������� ������� �2
            int[][] myArray_2 = new int[rang][rang];

            //�������� �������� �������
            int k = 0;

            //���������� ������� �1 �� 1 �� rang2
            for (int i_1 = 0; i_1 < rang; i_1++) {

                for (int j_1 = 0; j_1 < rang; j_1++) {

                    myArray_1[i_1][j_1] = ++k;

                }
            }

            //���������� ������� �2 �� rang2 �� 1
            for (int i_2 = 0; i_2 < rang; i_2++) {

                for (int j_2 = 0; j_2 < rang; j_2++) {

                    myArray_2[i_2][j_2] = k--;

                }
            }

            //������ �������� � ������� �1 �� ���������� �� ����
            for (int x = 0; x < rang; x += 4) {     //���������� x ������ �������� ���� �������� ���������� �������� � ����� ��������
                for (int y = 0; y < rang; y += 4) { //���������� y ������ �������� ���� �������� ���������� �������� � ����� ��������

                    //��������� �1 ����� ���������
                    for (int i = x, l = 0; i < (x + 4); i++, l++) { //������� ����� ���������� �������� � ����� ��������
                        for (int j = y, m = 0; j < (y + 4); j++, m++) { //������� �������� ���������� �������� � ����� ��������

                            if (l == m) {

                                myArray_1[i][j] = 0;
                            }
                        }
                    }

                    //��������� �2 ����� ���������
                    for (int i = x, l = 0; i < (x + 4); i++, l++) { //������� ����� ���������� �������� � ����� ��������
                        for (int j = y + 3, m = 4; j >= y; j--, m--) { //������� �������� ���������� �������� � ����� ��������

                            if ((m + l) == 4) {
                                myArray_1[i][j] = 0;
                            }
                        }
                    }
                }
            }

            //������ �������� � ������� �2 (����� �������� �� ����������) �� ����
            for (int i = 0; i < rang; i++) {
                for (int j = 0; j < rang; j++) {
                    if (myArray_1[i][j] != 0) {
                        myArray_2[i][j] = 0;
                    }
                }
            }

            //���������� ������� (�������� ���� ��������������� ������)
            for (int i = 0; i < rang; i++) {

                for (int j = 0; j < rang; j++) {

                    myArray[i][j] = myArray_1[i][j] + myArray_2[i][j];

                    System.out.print(myArray[i][j] + " ");

                }
                System.out.println();
            }

        }
        //������ ������ ���� ��������� 4
        else{

            int rang_ = rang/2;
            //��������������� ������� ������ ��������
            int[][] arr = new int[rang_][rang_];

            //�������� ����������� �������� � ������ ������ ��������
            int row = 0;

            int column_ = rang_/2;

            for (int k = 1; k <= Math.pow(rang_, 2); k++) {

                arr[row][column_] = k;

                if (k % rang_ == 0) {

                    row++;

                }
                else {

                    row--;

                    if (row < 0) row = rang_ - 1;

                    column_++;

                    if (column_ > rang_ - 1) column_ = 0;

                }
            }

            System.out.println();
            Print(arr);

            //���������� 1 ������ ��������
            for (int i = 0; i < rang/2; i++) {

                for (int j = 0; j <rang/2; j++) {

                    myArray[i][j] = arr[i][j];

                }
            }

            System.out.println();
            Print(myArray);

            //���������� 2, 3, 4 ������ ��������
            int number = 0; //����� ��������

            for (int x = 0; x < rang; x += rang / 2) {

                for (int y = 0; y < rang; y += rang / 2) {

                    if (x == 0 && y == 0) continue;
                    else if (x == 0 && y != 0) number = 2;
                    else if (x == rang/2 && y == 0) number = 3;
                    else if (x == rang/2 && y != 0) number = 1;

                    for (int i = x, i_ = 0; i < (x + rang / 2); i++, i_++) {

                        for (int j = y, j_ = 0; j < (y + rang / 2); j++, j_++) {

                            myArray[i][j] = arr[i_][j_] + number * rang / 2 * rang / 2;

                        }
                    }
                }
            }

            System.out.println();
            Print(myArray);

            //����� �������� �� ������������ ����������� ���
            int q = rang / 2 - 3;

            if (q > 0) {


                q /= 2;
                for (int j = rang / 2 - q; j <= rang / 2 + q - 1; j++) {

                    for (int i = 0, i_ = rang / 2; i < rang / 2; i++, i_++) {

                        int z = myArray[i][j];

                        myArray[i][j] = myArray[i_][j];

                        myArray[i_][j] = z;

                    }
                }
            }

            System.out.println();
            Print(myArray);

            //����� �������� �� ������
            for (int i = 0; i < rang / 2; i++) {

                if (i < 2) {

                    int z = myArray[i][i];

                    myArray[i][i] = myArray[i + rang / 2][i];

                    myArray[i + rang / 2][i] = z;

                }
                else if (i < rang / 2 - 1) {

                    for (int j = 1; j < 2; j++) {

                        int z = myArray[i][j];

                        myArray[i][j] = myArray[i + rang / 2][j];

                        myArray[i + rang / 2][j] = z;

                    }
                }
                else {

                    int z = myArray[i][0];

                    myArray[i][0] = myArray[i + rang / 2][0];

                    myArray[i + rang / 2][0] = z;

                }
            }
        }

        System.out.println();
        Print(myArray);
        System.out.println();
        PrintResult(myArray);
    }	
}
	


