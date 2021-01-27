package by.epam.jo_04_02_05.bean;

public enum TransportType {
	LAND(1), AIR(2), WATER(3);
	
	private int index;
	
	private TransportType(int index) {
		this.index = index;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
