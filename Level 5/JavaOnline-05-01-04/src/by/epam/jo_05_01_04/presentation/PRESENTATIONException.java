package by.epam.jo_05_01_04.presentation;

public class PRESENTATIONException extends Exception{

	private static final long serialVersionUID = -1075471100919504854L;
	
	public PRESENTATIONException() {
		super();
	}
	
	public PRESENTATIONException(Exception ex) {
		super(ex);
	}
	
	public PRESENTATIONException(String message) {
	    super(message);
	}
		
	public PRESENTATIONException(String message, Exception ex) {
	    super(message, ex);
	}
}
