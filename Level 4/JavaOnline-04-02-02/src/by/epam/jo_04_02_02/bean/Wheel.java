package by.epam.jo_04_02_02.bean;

import java.io.Serializable;

public class Wheel implements Serializable{

	private static final long serialVersionUID = -6710918680737795576L;
	private static int SERIAL_NUMBER = 1;
	
	private int serialNumber;
	private RubberType rubberType;
	private DiskType diskType;

	
	{
		this.serialNumber = SERIAL_NUMBER++;
	}
	
	public Wheel(RubberType rubberType, DiskType diskType) {
		this.rubberType = rubberType;
		this.diskType = diskType;
	}
	
	/*public Wheel() {}*/

	public RubberType getRubberType() {
		return rubberType;
	}


	public void setRubberType(RubberType rubberType) {
		this.rubberType = rubberType;
	}

	public DiskType getDiskType() {
		return diskType;
	}

	public void setDiskType(DiskType diskType) {
		this.diskType = diskType;
	}


	public int getSerialNumber() {
		return serialNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diskType == null) ? 0 : diskType.hashCode());
		result = prime * result + ((rubberType == null) ? 0 : rubberType.hashCode());
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
		Wheel other = (Wheel) obj;
		if (diskType != other.diskType)
			return false;
		if (rubberType != other.rubberType)
			return false;
		if (serialNumber != other.serialNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [serialNumber=" + serialNumber + ", rubberType=" + rubberType + ", diskType=" + diskType + "]";
	}
}
