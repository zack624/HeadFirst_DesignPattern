package edu.nust.behavioral.commandpattern.command;

import edu.nust.behavioral.commandpattern.Light;

public class LightOffCommand implements Command {
	Light light;
	
	public LightOffCommand(Light l) {
		this.light = l;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}

}
