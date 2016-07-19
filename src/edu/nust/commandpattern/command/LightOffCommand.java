package edu.nust.commandpattern.command;

import edu.nust.commandpattern.Light;

public class LightOffCommand implements Command {
	Light light;
	
	public LightOffCommand(Light l) {
		this.light = l;
	}

	@Override
	public void execute() {
		light.off();
	}

}
