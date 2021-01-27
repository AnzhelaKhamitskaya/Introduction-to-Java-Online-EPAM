package by.epam.jo_04_02_03.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Region implements Serializable {

	private static final long serialVersionUID = -3623410085006235335L;

	private String name;
	private String regionCenter; 
	private List<District> districts;
	private double square;
	
	public Region() {
		this("", "", new ArrayList<District>(), 0.0);
	}
	
	public Region(String name, String regionCenter) {
		this(name, regionCenter, new ArrayList<District>(), 0.0);
	}
	
	public Region(String name, String regionCenter, List<District> districts, double square) {
		this.name = name;
		this.regionCenter = regionCenter;
		this.districts = districts;
		this.square = square;
	}
	

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegionCenter() {
		return regionCenter;
	}

	public void setRegionCenter(String regionCenter) {
		this.regionCenter = regionCenter;
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
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((regionCenter == null) ? 0 : regionCenter.hashCode());
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
		Region other = (Region) obj;
		if (districts == null) {
			if (other.districts != null)
				return false;
		} else if (!districts.equals(other.districts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regionCenter == null) {
			if (other.regionCenter != null)
				return false;
		} else if (!regionCenter.equals(other.regionCenter))
			return false;
		if (Double.doubleToLongBits(square) != Double.doubleToLongBits(other.square))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Region [name=" + name + ", regionCenter=" + regionCenter + ", districts=" + districts + ", square="
				+ square + "]";
	}	
	
}
