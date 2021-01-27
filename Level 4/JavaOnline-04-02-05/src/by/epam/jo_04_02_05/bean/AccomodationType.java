package by.epam.jo_04_02_05.bean;

public enum AccomodationType { 
	SGL(1), DBL(2), DBL_EXB(3), DBL_CHD(4), DBL_EXB_CHD(5);
	
private int index;
	
	private AccomodationType(int index) {
		this.index = index;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
