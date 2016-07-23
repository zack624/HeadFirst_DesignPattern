package edu.nust.statepattern.state;

import java.util.Random;

import edu.nust.statepattern.CandyMachine;

public class CandySoldState implements State {
	private CandyMachine candyMachine;
	
	public CandySoldState(CandyMachine c) {
		candyMachine = c;
	}

	@Override
	public void insertMoney() {
		System.out.println("已投过钱,正在售出状态,请勿再投.");

	}

	@Override
	public void rotateMachine() {
		System.out.println("已转动过,请勿再转动.");

	}

	@Override
	public void moneyBack() {
		System.out.println("售出状态,无法退钱.");

	}

	@Override
	public void dispense() {
		System.out.println("掉出一颗糖果.");
		candyMachine.releaseCandy();
		
		if(candyMachine.getCandyCount() == 0){
			System.out.println("糖果售罄,不再提供糖果服务.");
			candyMachine.setState(candyMachine.getCandyEmptyState());
		}else{
			candyMachine.setState(candyMachine.getMoneyEmptyState());
		}

	}

}
