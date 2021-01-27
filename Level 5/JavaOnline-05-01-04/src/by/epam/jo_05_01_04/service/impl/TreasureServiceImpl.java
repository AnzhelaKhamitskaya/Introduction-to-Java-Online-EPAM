package by.epam.jo_05_01_04.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import by.epam.jo_05_01_04.bean.Treasure;
import by.epam.jo_05_01_04.dao.DAOException;
import by.epam.jo_05_01_04.dao.DAOProvider;
import by.epam.jo_05_01_04.dao.TreasureDao;
import by.epam.jo_05_01_04.service.SERVICEException;
import by.epam.jo_05_01_04.service.TreasureService;
import by.epam.jo_05_01_04.service.util.Validator;

public class TreasureServiceImpl implements TreasureService{
	
	
	@Override
	public List<Treasure> findTheMostExpensive() throws SERVICEException {
		
		int currentIndex = 0;
		int nextIndex = 1;
		List<Treasure> listAll;
		List<Treasure> list = new ArrayList<>();
		
		DAOProvider daoProvider = DAOProvider.getInstance();
		TreasureDao treasureDao = daoProvider.getTreasureDao();
				
		try {
			
			  listAll = treasureDao.getAll();
			  Collections.sort(listAll, new Comparator<Treasure>() {

				@Override
				public int compare(Treasure o1, Treasure o2) {
					if(o1.getPrice() < o2.getPrice()) {
						return 1;
					}else if(o1.getPrice() > o2.getPrice()) {
						return -1;
					}else if(o1.getPrice() == o2.getPrice()){
						return 0;
					}
					return 0;
				}
				
			});
			
			list.add(listAll.get(currentIndex));
			
			while(listAll.get(nextIndex).getPrice() == listAll.get(currentIndex).getPrice()) {
				list.add(listAll.get(nextIndex));
				nextIndex ++;
			}
		} catch (DAOException e) {
			throw new SERVICEException(e);
		}
		
		return list;
	}
	
	
	@Override
	public List<Treasure> getAll() throws SERVICEException {
		
		List<Treasure> listAll = new ArrayList<>();
		
		DAOProvider daoProvider = DAOProvider.getInstance();
		TreasureDao treasureDao = daoProvider.getTreasureDao();
	
			  try {
				listAll = treasureDao.getAll();
			} catch (DAOException e) {
				throw new SERVICEException(e);
			}
		
		return listAll;
	}

	
	@Override
	public List<Treasure> collectForThe(int amount) throws SERVICEException {
		
		if(!Validator.isValid(amount)) {
			throw new SERVICEException("Минимальная возможная сумма сокровищ - 10");
		}
		
		List<Treasure> listAll = new ArrayList<>();
		List <Treasure> result = new ArrayList<>();
		
		DAOProvider daoProvider = DAOProvider.getInstance();
		TreasureDao treasureDao = daoProvider.getTreasureDao();
		try {
			listAll = treasureDao.getAll();
		} catch (DAOException e) {
			throw new SERVICEException(e);
		}
		
			
		listAll.sort((o1, o2) -> o2.getPrice() - o1.getPrice());
		int tempSum = 0;

		for (Treasure artefact : listAll) {
			if (tempSum + artefact.getPrice() < amount) {
				tempSum += artefact.getPrice();
				result.add(artefact);
			}

		}

		return result;
	}
}
