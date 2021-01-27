package by.epam.jo_05_01_04.dao.impl;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import by.epam.jo_05_01_04.bean.Treasure;
import by.epam.jo_05_01_04.dao.DAOException;
import by.epam.jo_05_01_04.dao.TreasureDao;

public class TreasureDaoImpl implements TreasureDao{
	
	private static final String TREASURE_SOURSE = "resources/treasure.txt";
	
	@Override
	public List<Treasure> getAll() throws DAOException {
		
		List<Treasure> list = new ArrayList<>();
		Treasure treasure;
		String[] parameters;
		
		try (Scanner scanner = new Scanner(new FileInputStream(TREASURE_SOURSE))){			
			
			scanner.nextLine();
			scanner.nextLine();
			
			while (scanner.hasNext()) {
				
				parameters  = scanner.nextLine().split("\t");
				treasure = new Treasure(Integer.parseInt(parameters[0]),parameters[1], Integer.parseInt(parameters[2]));
				list.add(treasure);
	        }		
			
		} catch (FileNotFoundException e) {		
			throw new DAOException(e);			
		}
		
		return list;
	}
}
