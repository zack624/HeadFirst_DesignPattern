package edu.nust.behavioral.statepattern.state;

import edu.nust.behavioral.statepattern.CandyMachine;

public class CandyEmptyState implements State {
	private CandyMachine candyMachine;
	
	public CandyEmptyState(CandyMachine c) {
		candyMachine = c;
	}

	@Override
	public void insertMoney() {
		System.out.println("没有糖果,请勿投币.");
	}

	@Override
	public void rotateMachine() {
		System.out.println("没有糖果,请勿转动.");
	}

	@Override
	public void moneyBack() {
		System.out.println("没有糖果,无法退钱.");
	}

	@Override
	public void dispense() {
		System.out.println("没有糖果,无法分发.");
	}

}
