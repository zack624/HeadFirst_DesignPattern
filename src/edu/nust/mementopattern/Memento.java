package edu.nust.mementopattern;

public class Memento {
	private String gameState;

	public Memento(String gameState) {
		super();
		this.gameState = gameState;
	}

	public String getGameState() {
		return gameState;
	}

	public void setGameState(String gameState) {
		this.gameState = gameState;
	}

	
}
