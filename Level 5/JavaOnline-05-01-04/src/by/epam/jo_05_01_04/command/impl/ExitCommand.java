package by.epam.jo_05_01_04.command.impl;

import by.epam.jo_05_01_04.command.Command;

public class ExitCommand implements Command {

	@Override
	public String execute(String request) {
		System.exit(0);
		return null;
	}

}
