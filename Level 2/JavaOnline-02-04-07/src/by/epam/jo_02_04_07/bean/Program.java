//  Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

package by.epam.jo_02_04_07.bean;

public class Program {

	public static void main(String[] args) {

        int start = 4; //минимум 1
        int end = 9;   //минимум (start + 1);

        printSumOfFactorials(start, end);

    }

    public static void printSumOfFactorials(int start, int end){

        int SumOfFactorials = getSumOfFactorials(start, end);

        if(SumOfFactorials > 0) {
            System.out.print("Cумма факториалов всех нечетных чисел от " + start + " до " + end + " = " + SumOfFactorials);
        }else {
            System.out.print("Не существует");
        }
    }

    public static int getSumOfFactorials(int start, int end){

        int SumOfFactorials = 0;

        int i;

        if(start%2 != 0){
            i = start;
        }else{
            i = start+1;
        }

        for (; i < end+1; i += 2){

            SumOfFactorials += factorial(i);

        }

        return SumOfFactorials;
    }

    private static int factorial(int x){

        int factorial = 1;


            for (int i = 1; i <= x; i++) {
                factorial *= i;
            }


        return factorial;
    }
}
