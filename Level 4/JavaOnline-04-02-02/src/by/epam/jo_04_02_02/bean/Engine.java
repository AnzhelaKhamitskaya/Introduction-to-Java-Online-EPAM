package by.epam.jo_04_02_02.bean;

import java.io.Serializable;

public class Engine implements Serializable{	

	private static final long serialVersionUID = 2416028150144969612L;
	private static int SERIAL_NUMBER = 1;
	
	private int serialNumber;
	private int capacity;
	private FuelType fuelTipe;
	
	
	{
		this.serialNumber = SERIAL_NUMBER++;
	}
	
	public Engine(FuelType fuelType, int capacity) {
		this.capacity = capacity;
		this.fuelTipe = fuelType;
	}
	
	/*public Engine() {}*/
	
	public int getCapacity() {
		return capacity;
	}

	public FuelType getFuelTipe() {
		return fuelTipe;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + ((fuelTipe == null) ? 0 : fuelTipe.hashCode());
		result = prime * result + serialNumber;
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
		Engine other = (Engine) obj;
		if (capacity != other.capacity)
			return false;
		if (fuelTipe != other.fuelTipe)
			return false;
		if (serialNumber != other.serialNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [serialNumber=" + serialNumber + ", capacity=" + capacity + ", fuelTipe=" + fuelTipe + "]";
	}	
	
}
