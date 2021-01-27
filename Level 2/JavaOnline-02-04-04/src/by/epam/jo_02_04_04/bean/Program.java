//Ќа плоскости заданы своими координатами n точек. Ќаписать метод(методы), определ€ющие, между какими
//из пар точек самое большое рассто€ние. ”казание.  оординаты точек занести в массив.

package by.epam.jo_02_04_04.bean;

public class Program {

	  public static int indexOfCoordinateOfPointA = 0;
	   public static int indexOfCoordinateOfPointB = 0;
	   public static double distanceBetweenPointsAB = 0;

	    public static void main(String[] args) {

	        int[] arrCoordinateX = new int[]{-1, 0, 5};
	        int[] arrCoordinateY = new int[]{-2, 0, 8};

	        System.out.print("ћаксимальное рассто€ние = ");
	        System.out.printf("%.2f", maxDistanceBetweenPoints(arrCoordinateX, arrCoordinateY));

	        System.out.print (" между точками A(" + arrCoordinateX[indexOfCoordinateOfPointA] + ", " + arrCoordinateY[indexOfCoordinateOfPointA] +") и " +
	                                         "B(" + arrCoordinateX[indexOfCoordinateOfPointB] + ", " + arrCoordinateY[indexOfCoordinateOfPointB] + ")");

	    }

	    private static double getDistanceBetweenTwoPoints(int x1, int y1, int x2, int y2){
	        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	    }

	    private static double maxDistanceBetweenPoints(int[] arrCoordinateX, int[] arrCoordinateY){

	        for (int a = 0; a < arrCoordinateX.length-1; a++){
	            for (int b = a+1; b < arrCoordinateX.length; b++){
	                double distance;
	                distance = getDistanceBetweenTwoPoints(arrCoordinateX[a],arrCoordinateY[a], arrCoordinateX[b],arrCoordinateY[b]);
	                if(distance > distanceBetweenPointsAB) {
	                    distanceBetweenPointsAB = distance;
	                    indexOfCoordinateOfPointA = a;
	                    indexOfCoordinateOfPointB = b;
	                }
	            }
	        }

	        return distanceBetweenPointsAB;
	    }

}
