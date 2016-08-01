package edu.nust.behavioral.statepattern.state;

import edu.nust.behavioral.statepattern.CandyMachine;

public class MoneyEmptyState implements State {
	private CandyMachine candyMachine;
	
	public MoneyEmptyState(CandyMachine c) {
		candyMachine = c;
	}

	@Override
	public void insertMoney() {
		System.out.println("投钱成功,进入有钱状态.");
		candyMachine.setState(candyMachine.getMoneyHasState());
	}

	@Override
	public void rotateMachine() {
		System.out.println("虽然转动,但没投钱不能进入售出状态.");

	}

	@Override
	public void moneyBack() {
		System.out.println("还没投钱,不能退钱.");
	}

	@Override
	public void dispense() {
		System.out.println("还没投钱和转动,不能分发糖果.");
	}

}
