package by.epam.jo_05_01_04.controller;

import by.epam.jo_05_01_04.command.COMMANDProvider;
import by.epam.jo_05_01_04.command.Command;
import by.epam.jo_05_01_04.presentation.PRESENTATIONException;
import by.epam.jo_05_01_04.presentation.PRESENTATIONProvider;
import by.epam.jo_05_01_04.presentation.TreasurePresentation;

public class Controller {
	
	private final COMMANDProvider provider = new COMMANDProvider();
	private TreasurePresentation treasurePresentation = PRESENTATIONProvider.getInstance().getTreasurePresentation();

	public void doAction() {
 		
		String request;
		String responce;
		String commandName;
		Command command;
		
		 do { 
			 	try {
					request = treasurePresentation.mainMenu();
					commandName = request.split(" ")[0];	
				    command = provider.getCommand(commandName);
				    responce = command.execute(request);			
			        treasurePresentation.print(responce);
				} catch (PRESENTATIONException e) {
					System.out.println("Ошибка отображения результата команды\n\n");	
				} 
		        
		 }while(true);		
	}
}