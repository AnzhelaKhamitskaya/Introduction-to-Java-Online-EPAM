package by.epam.jo_05_01_04.service;

import by.epam.jo_05_01_04.service.impl.TreasureServiceImpl;

public class SERVICEProvider {
	
	private static final SERVICEProvider INSTANCE = new SERVICEProvider();
	
	private TreasureService treasureService = new TreasureServiceImpl();
	
	private SERVICEProvider() {}

	public static SERVICEProvider getInstance() {
		return INSTANCE;
	}

	public TreasureService getTreasureService() {
		return treasureService;
	}
}
