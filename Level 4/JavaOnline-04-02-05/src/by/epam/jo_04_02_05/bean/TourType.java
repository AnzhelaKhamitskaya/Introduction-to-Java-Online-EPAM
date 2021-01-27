package by.epam.jo_04_02_05.bean;

public enum TourType {
	SEE_REST(1), EXCURSION(2), TREATMENT(3), SHOPPING(4), CRUISE(5);
	
	private int index;
	
	private TourType(int index) {
		this.index = index;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
}
