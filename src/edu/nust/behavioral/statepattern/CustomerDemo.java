package edu.nust.behavioral.statepattern;
/**
 * 状态模式(State Pattern)
 * 允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类
 * @author zack
 * @since 2016年7月23日
 */
public class CustomerDemo {
	public static void main(String[] args) {
		CandyMachine candyMachine = new CandyMachine(5);
		
		candyMachine.printState();
		
		candyMachine.insertMoney();
		candyMachine.rotateMachine();
		candyMachine.printState();
		
		candyMachine.insertMoney();
		candyMachine.rotateMachine();
		candyMachine.printState();
	}
}
