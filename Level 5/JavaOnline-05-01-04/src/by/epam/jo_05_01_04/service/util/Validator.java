package by.epam.jo_05_01_04.service.util;

public class Validator {
	
	public static boolean isValid(int amount) {		
		if(amount < 10) {
			return false;
		}
		return true;
	}
}
