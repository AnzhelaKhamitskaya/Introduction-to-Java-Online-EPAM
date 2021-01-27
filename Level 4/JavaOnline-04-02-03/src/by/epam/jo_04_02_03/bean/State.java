package by.epam.jo_04_02_03.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class State implements Serializable{

	private static final long serialVersionUID = -6053233407903846926L;
	
	private String name;
	private String capital; 
	private List<Region> regions;
	private double square;
	
	public State() {
		this("", "", new ArrayList<Region>(), 0);
	}
	
	public State(String name, String capital) {
		this(name, capital, new ArrayList<Region>(), 0);
	}
	
	public State(String name, String capital, List<Region> regions, double square) {
		this.name = name;
		this.capital = capital;
		this.regions = regions;
		this.setSquare(square);
	}
	

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
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
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
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
		State other = (State) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		if (Double.doubleToLongBits(square) != Double.doubleToLongBits(other.square))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [name=" + name + ", capital=" + capital + ", regions=" + regions + ", square=" + square + "]";
	}	
	
}
