package by.epam.jo_05_01_04.dao;

public class DAOException extends Exception{ //конструкторы пользовательских исключений ????

	private static final long serialVersionUID = 1489029510251897122L;

	public DAOException() {
		super();
	}
	
	public DAOException(Exception ex) {
		super(ex);
	}
	
	public DAOException(String message) {
	    super(message);
	}
		
	public DAOException(String message, Exception ex) {
	    super(message, ex);
	}
}

