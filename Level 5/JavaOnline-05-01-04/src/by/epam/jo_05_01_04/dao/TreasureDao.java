package by.epam.jo_05_01_04.dao;

import java.util.List;

import by.epam.jo_05_01_04.bean.Treasure;

public interface TreasureDao {
	List<Treasure> getAll() throws DAOException;	
}
