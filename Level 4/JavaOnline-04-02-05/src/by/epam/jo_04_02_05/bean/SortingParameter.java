package by.epam.jo_04_02_05.bean;

public enum SortingParameter {
	PERIOD(false), PRICE(false);
	
	private boolean parameter;

	private SortingParameter(boolean parameter) {
		this.setParameter(parameter);
	}

	public boolean isParameter() {
		return parameter;
	}

	public void setParameter(boolean parameter) {
		this.parameter = parameter;
	}
}
