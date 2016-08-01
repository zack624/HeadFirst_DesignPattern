package edu.nust.behavioral.commandpattern.command;


/**
 * 空对象
 * @author zack
 * @since 2016年7月15日
 */
public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("no command.");
	}

	@Override
	public void undo() {
		System.out.println("no command.");		
	}

}
