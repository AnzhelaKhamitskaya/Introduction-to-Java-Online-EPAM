package by.epam.jo_05_01_04.command.impl;

import java.util.List;

import by.epam.jo_05_01_04.bean.Treasure;
import by.epam.jo_05_01_04.command.Command;
import by.epam.jo_05_01_04.service.SERVICEException;
import by.epam.jo_05_01_04.service.SERVICEProvider;
import by.epam.jo_05_01_04.service.TreasureService;

public class CollectForTheAmountCommand implements Command {

	@Override
	public String execute(String request) {
		
		String responce;
		int amount;
		amount = Integer.parseInt(request.split(" ")[1]);
		
		SERVICEProvider provider = SERVICEProvider.getInstance();
		TreasureService treasureService= provider.getTreasureService();
		
		try {
			List<Treasure> list;
			list = treasureService.collectForThe(amount);
			responce = list.toString();
			
		} catch (SERVICEException e) {
			responce = String.format("������ �������� �� ����� ������ 10 �� ����� ���� �����������\n\n");
		}
		
		return responce;
	}

}
