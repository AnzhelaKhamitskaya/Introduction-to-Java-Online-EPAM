//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел

package by.epam.jo_02_04_02.bean;

public class Program {

	public static void main(String[] args) {

        int nod = nodForFourNumbers(27,0,90, 9);

        System.out.println("НОД = " + nod);

    }

    private static int nod(int x, int y){
        while (x!=0&&y!=0){
            if(x>y){
                x %= y;
            }else {
                y %= x;
            }
        }
        return x+y;
    }

    private static int nodForFourNumbers(int x, int y, int z, int w){
    	
        int nod = nod(x, nod(y, nod (z, w)));
        return nod;
    }
}
