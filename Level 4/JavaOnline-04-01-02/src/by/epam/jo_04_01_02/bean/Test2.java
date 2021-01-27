/*
 * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
 * конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
 * класса.
 */

package by.epam.jo_04_01_02.bean;

import java.io.Serializable;

public class Test2 implements Serializable{

	private static final long serialVersionUID = -6446047908754651564L;
	
	private int x;
	private int y;
	
	public Test2() {
		this(5, 6);
	}

	public Test2(int x, int y) {
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
	public String toString() {
		return this.getClass().getSimpleName() + " [x=" + x + ", y=" + y + "]";
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
		Test2 other = (Test2) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	public void print() {
    	System.out.println(this);
    }
	
	public static void main(String[] args) {
		Test2 test1 = new Test2();
		Test2 test2 = new Test2(15, 16);
		test1.setX(0);		
		test1.print();
		test2.print();
	}

}
