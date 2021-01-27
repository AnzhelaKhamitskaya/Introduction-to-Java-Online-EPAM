
//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

package by.epam_jo_02_04_03.bean;

public class Program {

	public static void main(String[] args) {
        double a = 16.01;
        double sEquilateralHexagon = sEquilateralHexagon(a);
        System.out.print("S правильного шестиугольника со стороной " + a + " = ");
        System.out.printf("%.2f", sEquilateralHexagon);
    }

    private static double sEquilateralTriangle(double side){
        return 0.5 * Math.pow(side, 2) * Math.sin(Math.toRadians(60));
    }

    private static double sEquilateralHexagon(double side){
        return 6 * sEquilateralTriangle(side);
    }

}
