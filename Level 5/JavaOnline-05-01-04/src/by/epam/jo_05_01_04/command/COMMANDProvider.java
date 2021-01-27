package by.epam.jo_05_01_04.command;

import java.util.HashMap;
import java.util.Map;

import by.epam.jo_05_01_04.command.impl.CollectForTheAmountCommand;
import by.epam.jo_05_01_04.command.impl.ExitCommand;
import by.epam.jo_05_01_04.command.impl.FindTheMostExpensiveCommand;
import by.epam.jo_05_01_04.command.impl.GetAllCommand;

public class COMMANDProvider {
	
	private Map <String, Command> commands;
	
	public COMMANDProvider() {
		commands = new HashMap<String, Command>();
		commands.put("FindTheMostExpensive", new FindTheMostExpensiveCommand());
		commands.put("CollectForThe", new CollectForTheAmountCommand());
		commands.put("GetAll", new GetAllCommand());
		commands.put("Exit", new ExitCommand());
	}
	
	public Command getCommand(String CommandName) {
		Command command;
		command = commands.get(CommandName);
		return command; 
	}
}
