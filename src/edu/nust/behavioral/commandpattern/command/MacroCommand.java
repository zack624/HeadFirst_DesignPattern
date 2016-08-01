package edu.nust.behavioral.commandpattern.command;

public class MacroCommand implements Command{
	Command[] commands;
	
	public MacroCommand(Command[] cs){
		commands = cs;
	}
	
	@Override
	public void execute() {
		for (Command command : commands) {
			command.execute();
		}
		
	}

	@Override
	public void undo() {
		int len = commands.length;
		for (int i = len - 1 ; i >= 0;i--) {
			commands[i].undo();
		}
		
	}

}
