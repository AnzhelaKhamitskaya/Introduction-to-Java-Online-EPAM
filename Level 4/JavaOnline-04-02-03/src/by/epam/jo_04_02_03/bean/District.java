package by.epam.jo_04_02_03.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class District implements Serializable {

	private static final long serialVersionUID = 7955866183513943941L;

	private String name;
	private String districtCenter; 
	private List<Town> towns;
	private double square;
	
	public District() {
		this("", "", new ArrayList<Town>(), 0.0);
	}
	
	public District(String name, String districtCenter) {
		this(name, districtCenter, new ArrayList<Town>(), 0.0);
	}
	
	public District(String name, String districtCenter, List<Town> towns, double square) {
		this.name = name;
		this.districtCenter = districtCenter;
		this.towns = towns;
		this.square = square;
	}
	
	public List<Town> getTowns() {
		return towns;
	}
	public void setTowns(List<Town> towns) {
		this.towns = towns;
	}
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistrictCenter() {
		return districtCenter;
	}
	public void setDistrictCenter(String districtCenter) {
		this.districtCenter = districtCenter;
	}

	public double getSquare() {
		return square;
	}

	public void setSquare(double square) {
		this.square = square;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((districtCenter == null) ? 0 : districtCenter.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(square);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((towns == null) ? 0 : towns.hashCode());
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
		District other = (District) obj;
		if (districtCenter == null) {
			if (other.districtCenter != null)
				return false;
		} else if (!districtCenter.equals(other.districtCenter))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(square) != Double.doubleToLongBits(other.square))
			return false;
		if (towns == null) {
			if (other.towns != null)
				return false;
		} else if (!towns.equals(other.towns))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "District [name=" + name + ", districtCenter=" + districtCenter + ", towns=" + towns + ", square="
				+ square + "]";
	}
}
