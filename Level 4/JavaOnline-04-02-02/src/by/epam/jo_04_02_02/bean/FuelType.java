package by.epam.jo_04_02_02.bean;

public enum FuelType {
	PETROL("PL"), DIESEL("DL");
	
	private String abbreviation;
	
	private FuelType(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	
	public String getAbbreviation(){ return abbreviation;}
}
