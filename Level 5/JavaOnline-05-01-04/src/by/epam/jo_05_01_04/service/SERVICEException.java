package by.epam.jo_05_01_04.service;

public class SERVICEException extends Exception{
	
	private static final long serialVersionUID = -6938669970457145793L;
	
	public SERVICEException() {
		super();
	}
	
	public SERVICEException(Exception ex) {
		super(ex);
	}
	
	public SERVICEException(String message) {
	    super(message);
	}
		
	public SERVICEException(String message, Exception ex) {
	    super(message, ex);
	}
}
