package by.epam.jo_04_02_02.bean;

public enum WheelPosition {
	FRONT_LEFT(0), FRONT_RIGHT(1), REAR_LEFT(2), REAR_RIGHT(3), EXTRA(4);
	
	private int index;
	
	WheelPosition(int position) {
		this.index = position;
	}

	public int getIndex() {
		return index;
	}
}
