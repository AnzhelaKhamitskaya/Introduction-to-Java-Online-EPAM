package by.epam.jo_05_01_04.service;

import java.util.List;

import by.epam.jo_05_01_04.bean.Treasure;

public interface TreasureService {
	List<Treasure> findTheMostExpensive() throws SERVICEException;
	List<Treasure> collectForThe(int amount) throws SERVICEException;
	List<Treasure> getAll() throws SERVICEException;

}
