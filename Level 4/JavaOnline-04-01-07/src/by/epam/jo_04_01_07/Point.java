package by.epam.jo_04_01_07;

import java.io.Serializable;
import java.util.Scanner;

public class Point implements Serializable{
	
	private static final long serialVersionUID = -6058317288362162332L;
	
	public double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
		this(0, 0);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [x=" + x + ", y=" + y + "]";
	}

	public static double distance(Point a, Point b) {
		double dx = a.x - b.x;
		double dy = a.y - b.y;
		return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
	}

	public void read(Scanner scanner) {
		System.out.print("x: ");
		x = scanner.nextDouble();
		System.out.print("y: ");
		y = scanner.nextDouble();
	}
}
