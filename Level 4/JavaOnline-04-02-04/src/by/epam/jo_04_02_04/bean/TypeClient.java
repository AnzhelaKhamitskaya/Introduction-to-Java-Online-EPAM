package by.epam.jo_04_02_04.bean;

public enum TypeClient {
	ENTITY("3012"), INDIVIDUAL_ENTREPRENEUR("3013"), INDIVIDUAL("3014"), NON_PROFIT_ORGANIZATION("3015");
	
	private String number;
	
	private TypeClient(String number){
		this.number = number;
	}

	public String getNumber() {
		return number;
	}
	
}
