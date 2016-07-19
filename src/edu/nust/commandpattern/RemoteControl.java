package edu.nust.commandpattern;

import edu.nust.commandpattern.command.Command;
import edu.nust.commandpattern.command.NoCommand;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	
	//初始化按钮命令都为NoCommand
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		for(int i = 0 ; i < 7 ; i++){
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
	}

	public void setCommands(int slot,Command onc,Command offc){
		onCommands[slot] = onc;
		offCommands[slot] = offc;
	}
	
	public void OnButtonWasPushed(int slot){
		onCommands[slot].execute();
	}
	
	public void OffButtonWasPushed(int slot){
		offCommands[slot].execute();
	}
	
	public void showButtonDescription(){
		for(int i = 0; i < onCommands.length;i++){
			String commandClassName = onCommands[i].getClass().getName();
			String commandName = commandClassName.substring(commandClassName.lastIndexOf(".")+1);
			System.out.print(commandName+",");
		}
		System.out.println();
	}
}
