package by.epam.jo_05_01_04.presentation;

import by.epam.jo_05_01_04.presentation.impl.TreasurePresentationImpl;

public class PRESENTATIONProvider {
	private static final PRESENTATIONProvider INSTANCE = new PRESENTATIONProvider();
		
		private TreasurePresentation treasurePresentation = new TreasurePresentationImpl();
		
		private PRESENTATIONProvider() {}
	
		public static PRESENTATIONProvider getInstance() {
			return INSTANCE;
		}
	
		public TreasurePresentation getTreasurePresentation() {
			return treasurePresentation;
		}
}
