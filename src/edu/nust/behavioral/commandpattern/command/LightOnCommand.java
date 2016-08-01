package edu.nust.behavioral.commandpattern.command;

import edu.nust.behavioral.commandpattern.Light;

public class LightOnCommand implements Command {
	Light light;
	
	public LightOnCommand(Light l){
		//为什么不直接在属性时实例化？
		this.light = l;
	}
	
	@Override
	public void execute() {
		light.on();
	}
	
	public void undo(){
		light.off();
	}

}
