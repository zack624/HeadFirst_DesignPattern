package edu.nust.statepattern;

import edu.nust.statepattern.state.CandyEmptyState;
import edu.nust.statepattern.state.CandySoldState;
import edu.nust.statepattern.state.LuckyState;
import edu.nust.statepattern.state.MoneyEmptyState;
import edu.nust.statepattern.state.MoneyHasState;
import edu.nust.statepattern.state.State;

public class CandyMachine {
	private State moneyEmptyState;
	private State moneyHasState;
	private State candySoldsState;
	private State candyEmptyState;
	private State luckyState;
	
	private State currentState;
	private int candyCount;
	
	public CandyMachine(int count) {
		moneyEmptyState = new MoneyEmptyState(this);
		moneyHasState = new MoneyHasState(this);
		candySoldsState = new CandySoldState(this);
		candyEmptyState = new CandyEmptyState(this);
		luckyState = new LuckyState(this);
		
		candyCount = count;
		if(count == 0){
			currentState = candyEmptyState;
		}else{
			currentState = moneyEmptyState;
		}
	}

	public void insertMoney(){
		currentState.insertMoney();
	}
	public void rotateMachine(){
		currentState.rotateMachine();
		currentState.dispense();
	}
	public void moneyBack(){
		currentState.moneyBack();
	}

	public void setState(State s){
		currentState = s;
	}
//	顾客也可调用该方法,存在问题.将实际分发糖果行为交由candySold执行.
	public void releaseCandy(){
		if(candyCount != 0){
			candyCount--;
		}
	}

	public State getMoneyEmptyState() {
		return moneyEmptyState;
	}

	public State getMoneyHasState() {
		return moneyHasState;
	}

	public State getCandySoldsState() {
		return candySoldsState;
	}

	public State getCandyEmptyState() {
		return candyEmptyState;
	}

	public State getCurrentState() {
		return currentState;
	}

	public int getCandyCount() {
		return candyCount;
	}
	
	public State getLuckyState() {
		return luckyState;
	}

	public void printState(){
		System.out.print("The current state is ");
		if(currentState instanceof CandyEmptyState){
			System.out.println("candy empty.count is " + candyCount);
		}else if(currentState instanceof MoneyEmptyState){
			System.out.println("money empty. count is " + candyCount);
		}else if(currentState instanceof MoneyHasState){
			System.out.println("money has.count is " + candyCount);
		}else if(currentState instanceof CandySoldState){
			System.out.println("candy sold.count is " + candyCount);
		}
	}
}
