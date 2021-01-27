package by.epam.jo_04_02_02.bean;

public class NotEnoughWheelsException extends Exception {

	private static final long serialVersionUID = 1363120755021989415L;
	
	private int size;
	
	public NotEnoughWheelsException(String message, int size) {
		super(message);
		this.size = size;
	}

	public int getSize() {
		return size;
	}

}
