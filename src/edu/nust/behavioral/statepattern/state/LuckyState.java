package edu.nust.behavioral.statepattern.state;

import edu.nust.behavioral.statepattern.CandyMachine;

public class LuckyState implements State {
	private CandyMachine candyMachine;
	
	public LuckyState(CandyMachine c) {
		super();
		this.candyMachine = c;
	}

	@Override
	public void insertMoney() {

	}

	@Override
	public void rotateMachine() {
		// TODO Auto-generated method stub

	}

	@Override
	public void moneyBack() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispense() {
		System.out.println("掉出两颗糖果.");
		candyMachine.releaseCandy();
		candyMachine.releaseCandy();
		
		if(candyMachine.getCandyCount() == 0){
			System.out.println("糖果售罄,不再提供糖果服务.");
			candyMachine.setState(candyMachine.getCandyEmptyState());
		}else{
			candyMachine.setState(candyMachine.getMoneyEmptyState());
		}
	}

}
