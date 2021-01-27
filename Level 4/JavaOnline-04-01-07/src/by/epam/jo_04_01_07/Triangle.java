/*
 * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
 * площади, периметра и точки пересечения медиан.
*/
package by.epam.jo_04_01_07;

import java.io.Serializable;
import java.util.Scanner;

public class Triangle implements Serializable {

	private static final long serialVersionUID = -4495496742309738395L;

	private Point a, b, c;

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
		this(new Point(), new Point(), new Point());
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public double square() {
		double ab = Point.distance(a, b);
		double bc = Point.distance(b, c);
		double ac = Point.distance(a, c);
		double halfPerimeter = (ab + bc + ac) / 2;
		return Math.sqrt(halfPerimeter * (halfPerimeter - ab) * (halfPerimeter - bc) * (halfPerimeter - ac));
	}

	public double perimeter() {
		double ab = Point.distance(a, b);
		double bc = Point.distance(b, c);
		double ac = Point.distance(a, c);
		return ab + bc + ac;
	}

	public Point median_crossing() {
		return new Point((a.x + b.x + c.x) / 3, (a.y + b.y + c.y) / 3);
	}

	public static boolean isTriangle(Point a, Point b, Point c) {

		double ab = Point.distance(a, b);
		double ac = Point.distance(a, c);
		double bc = Point.distance(b, c);

		if (ab + ac > bc && ab + bc > ac && bc + ac > ab) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		result = prime * result + ((c == null) ? 0 : c.hashCode());
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
		Triangle other = (Triangle) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		if (c == null) {
			if (other.c != null)
				return false;
		} else if (!c.equals(other.c))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Point a = new Point();
		Point b = new Point();
		Point c = new Point();

		System.out.println("enter A");
		a.read(scanner);
		System.out.println("enter B");
		b.read(scanner);
		System.out.println("enter C");
		c.read(scanner);

		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());

		Triangle triangle = new Triangle();

		if (Triangle.isTriangle(a, b, c)) {

			triangle = new Triangle(a, b, c);

			System.out.println("square: " + triangle.square());
			System.out.println("perimeter: " + triangle.perimeter());
			System.out.println("median_crossing: " + triangle.median_crossing());

		} else {
			System.out.println("Невозможно создать треугольник");
		}
	}

}
