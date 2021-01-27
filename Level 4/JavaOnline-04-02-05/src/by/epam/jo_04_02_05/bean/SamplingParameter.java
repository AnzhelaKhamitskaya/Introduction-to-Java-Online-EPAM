package by.epam.jo_04_02_05.bean;

public enum SamplingParameter {
	FOOD(""), TRANSPORT(""), ACCOMODATION(""), TOUR("");
	
	private String parameter;

	private SamplingParameter(String parameter) {
		this.setParameter(parameter);
	}

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}
}
