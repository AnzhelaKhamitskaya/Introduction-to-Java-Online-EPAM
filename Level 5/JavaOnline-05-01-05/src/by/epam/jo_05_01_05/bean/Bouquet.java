package by.epam.jo_05_01_05.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bouquet implements Serializable{

	private static final long serialVersionUID = 4564267097333755713L;

	private static int ID = 0;
	
	private List <Flower> flowers = new ArrayList <Flower>();
	private List <Packaging> packaging = new ArrayList <Packaging>();
	
	public Bouquet() {
		super();	
		ID++;
	}
	
	public Bouquet( List <Flower> flowers, List <Packaging> packaging) {
		ID++;	
		this.setFlowers(flowers);
		this.setPackaging(packaging);
	}
	
	public List <Flower> getFlowers() {
		return flowers;
	}
	public void setFlowers(List <Flower> flowers) {
		this.flowers = flowers;
	}
	
	public List <Packaging> getPackaging() {
		return packaging;
	}
	public void setPackaging(List <Packaging> packaging) {
		this.packaging = packaging;
	}
	
	public static int getID() {
		return ID;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " [flowers=" + flowers + ", packaging=" + packaging + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flowers == null) ? 0 : flowers.hashCode());
		result = prime * result + ((packaging == null) ? 0 : packaging.hashCode());
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
		Bouquet other = (Bouquet) obj;
		if (flowers == null) {
			if (other.flowers != null)
				return false;
		} else if (!flowers.equals(other.flowers))
			return false;
		if (packaging == null) {
			if (other.packaging != null)
				return false;
		} else if (!packaging.equals(other.packaging))
			return false;
		return true;
	}	
}
