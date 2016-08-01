package edu.nust.behavioral.mementopattern;

public class GameOriginator {
	private String gameState;
	private Caretaker caretaker;
	
	public GameOriginator(String gameState,Caretaker c) {
		super();
		this.gameState = gameState;
		this.caretaker = c;
	}
	public Memento createMemento(){
		Memento m = new Memento(gameState);
		caretaker.setMemento(m);
		return m;
	}
	public void restoreState(){
		gameState = this.caretaker.getMemento().getGameState();
	}
	
	public String getGameState() {
		return gameState;
	}

	public Caretaker getCaretaker() {
		return caretaker;
	}

	public void setCaretaker(Caretaker caretaker) {
		this.caretaker = caretaker;
	}

	public void setGameState(String gameState) {
		this.gameState = gameState;
	}

}
