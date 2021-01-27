package by.epam.jo_04_02_03.bean;

import java.io.Serializable;

public class Town implements Serializable {

	private static final long serialVersionUID = 8745583613524751444L;

	private String name;
	private double square;
	
	public Town() {
		this("", 0.0);
	}
	
	public Town(String name, double square) {
		this.name = name;
		this.square = square;
	}
	
	public double getSquare() {
		return square;
	}
	public void setSquare(double square) {
		this.square = square;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(square);
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
		Town other = (Town) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(square) != Double.doubleToLongBits(other.square))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [name=" + name + ", square=" + square + "]";
	}	
}
