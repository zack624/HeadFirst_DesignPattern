package edu.nust.behavioral.commandpattern.command;

import edu.nust.behavioral.commandpattern.CellingFan;

public class CellingFanOffCommand implements Command {
	CellingFan cellingFan;
	
	public CellingFanOffCommand(CellingFan cellingFan) {
		this.cellingFan = cellingFan;
	}

	@Override
	public void execute() {
		cellingFan.off();
	}

	@Override
	public void undo() {
		cellingFan.low();
		cellingFan.high();
		
	}

}
