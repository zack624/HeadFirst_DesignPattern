package edu.nust.mementopattern;

/**
 * 备忘录模式（Memento Pattern）
 * 在不破坏封装的前提下，捕获一个对象的内部状态，并在对象之外保存这个状态，
 * 以后就能恢复保存的这个状态
 * @author zack
 * @since 2016年7月28日
 */
public class PlayerDemo {
	public static void main(String[] args) {
		GameOriginator game = new GameOriginator("stage1",new Caretaker());
		
		game.setGameState("stage2");
		game.createMemento();
		game.setGameState("stage3");
		game.createMemento();
		game.setGameState("stage4");
		game.restoreState();
		System.out.println(game.getGameState());
	}
}
