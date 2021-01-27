/*
 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
 * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
 * наибольшее значение из этих двух переменных.
 */

package by.epam.jo_04_01_01.bean;

import java.io.Serializable;

public class Test1 implements Serializable  {

	private static final long serialVersionUID = 1507892294329713407L;
	
	private int x;
	private int y;

	public Test1() {
		this(0, 0);
	}

	public Test1(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
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
		Test1 other = (Test1) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [x=" + x + ", y=" + y + "]";
	}

	public int getSumOfFields() {
		return x + y;
	}

	public int getHighestValueAmongFields() {
		if (x >= y) {
			return x;
		}
		return y;
	}
	
    public void print() {
    	System.out.println(this);
    }

	public static void main(String[] args) {

		Test1 test1 = new Test1();
		Test1 test2 = new Test1(5, 16);
		test1.print();
		test2.print();
		
		System.out.printf("Сумма полей x и y равна %s", test1.getSumOfFields());
		System.out.printf("\nНаибольшее значение среди полей равно %s", test2.getHighestValueAmongFields());
	}

}
