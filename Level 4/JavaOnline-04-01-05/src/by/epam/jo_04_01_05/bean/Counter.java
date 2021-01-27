/*
 * ������� �����, ����������� ���������� �������, ������� ����� ����������� ��� ��������� ���� ��������
 * �� ������� � �������� ���������. ������������� ������������� �������� ���������� �� ��������� �
 * ������������� ����������. ������� ����� ������ ���������� � ���������� ���������, � �����
 * ����������� �������� ��� ������� ���������. �������� ���, ��������������� ��� ����������� ������.
 */

package by.epam.jo_04_01_05.bean;

import java.io.Serializable;

public class Counter implements Serializable{

	private static final long serialVersionUID = 8073510488418280525L;
	private final static int INCREMENTAL_VALUE = 1;	
	
	private int currentValue;
	private int upperLimitValue;
	private int lowerLimitValue;
	
	public Counter() {
		this(1, 10, 0);
	}
	
	public Counter(int currentValue, int upperLimitValue, int lowerLimitValue) {
		this.currentValue = currentValue;
		this.upperLimitValue = upperLimitValue;
		this.lowerLimitValue = lowerLimitValue;
	}

	public int getCurrentValue() {
		return currentValue;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currentValue;
		result = prime * result + lowerLimitValue;
		result = prime * result + upperLimitValue;
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
		Counter other = (Counter) obj;
		if (currentValue != other.currentValue)
			return false;
		if (lowerLimitValue != other.lowerLimitValue)
			return false;
		if (upperLimitValue != other.upperLimitValue)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [currentValue=" + currentValue + ", upperLimitValue=" + upperLimitValue + ", lowerLimitValue="
				+ lowerLimitValue + ", INCREMENTAL_VALUE=" + INCREMENTAL_VALUE  + "]";
	}

	public void increaseCounterValue() {
		if (currentValue == upperLimitValue) {
			return;
		}
		currentValue += INCREMENTAL_VALUE;
	}

	public void decreaseCounterValue() {
		if (currentValue == lowerLimitValue) {
			return;
		}
		currentValue -= INCREMENTAL_VALUE;
	}
	

	public static void main(String[] args) {
		Counter c1 = new Counter();
		System.out.println(c1.getCurrentValue());
		System.out.println(c1);
		
		c1 = new Counter(9, 10, 8);
		System.out.println(c1.getCurrentValue());
		System.out.println(c1);
		
		c1.increaseCounterValue();
		c1.increaseCounterValue();
		System.out.println(c1.getCurrentValue());
		System.out.println(c1);
		c1.decreaseCounterValue();
		
		c1.decreaseCounterValue();
		c1.decreaseCounterValue();
		System.out.println(c1.getCurrentValue());
		System.out.println(c1);
	}
}
