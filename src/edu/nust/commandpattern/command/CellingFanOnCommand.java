package edu.nust.commandpattern.command;

import edu.nust.commandpattern.CellingFan;

public class CellingFanOnCommand implements Command{
	CellingFan cellingFan;
	
	public CellingFanOnCommand(CellingFan cellingFan) {
		this.cellingFan = cellingFan;
	}

	@Override
	public void execute() {
		cellingFan.low();
		cellingFan.high();
	}

	@Override
	public void undo() {
		cellingFan.off();
	}

}
