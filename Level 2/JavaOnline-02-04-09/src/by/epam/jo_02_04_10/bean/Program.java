//Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//если угол между сторонами длиной X и Y— прямой.

package by.epam.jo_02_04_10.bean;

public class Program {

	 public static void main(String[] args) {

	        double x = 5;
	        double y = 7;
	        double z = 8;
	        double t = 6;

	        printS(x, y, z, t);

	    }

	    private static void printS(double x, double y, double z, double t) {
	        System.out.printf("%.2f", S(x, y, z, t));
	    }

	    private static double S(double x, double y, double z, double t) {
	        double s1 = getS1(x, y);
	        double s2 = getS2(x, y, z, t);
	        return s1 + s2;
	    }

	    private static double getS1(double x, double y) {
	        return 0.5 * x * y;
	    }

	    private static double getS2(double x, double y, double z, double t) {

	        double c = getC(x,y);
	        double p = getP(c, z, t);
	        return Math.sqrt(p*(p-z)*(p-t)*(p-c));
	    }

	    private static double getC(double x, double y) {
	        return  Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	    }

	    private static double getP(double c, double z, double t) {
	        return  (z + t + c) * 0.5;
	    }
}
