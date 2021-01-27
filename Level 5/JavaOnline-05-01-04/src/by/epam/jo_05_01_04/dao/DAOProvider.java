package by.epam.jo_05_01_04.dao;

import by.epam.jo_05_01_04.dao.impl.TreasureDaoImpl;

public class DAOProvider {
	
	private static final DAOProvider INSTANCE = new DAOProvider();
	
	private TreasureDao treasureDao = new TreasureDaoImpl();
	
	public DAOProvider() {};

	public static DAOProvider getInstance() {
		return INSTANCE;
	}
	
	public TreasureDao getTreasureDao() {
		return treasureDao;
	}
}
