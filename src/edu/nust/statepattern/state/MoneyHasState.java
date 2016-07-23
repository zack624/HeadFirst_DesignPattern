package edu.nust.statepattern.state;

import java.util.Random;

import edu.nust.statepattern.CandyMachine;

public class MoneyHasState implements State {
	CandyMachine candyMachine;
	int luckyNumber;
	
	public MoneyHasState(CandyMachine c) {
		this.candyMachine = c;
	}

	@Override
	public void insertMoney() {
		System.out.println("已经有钱了，不能再投钱。");
	}

	@Override
	public void rotateMachine() {
		System.out.println("转动中...");
		luckyNumber = new Random().nextInt(3);
		System.out.println("your luckyNumber:"+luckyNumber);
		if(luckyNumber == 1 && candyMachine.getCandyCount() > 1){
			System.out.println("恭喜中奖!");
			candyMachine.setState(candyMachine.getLuckyState());
		}else{
			candyMachine.setState(candyMachine.getCandySoldsState());
		}
	}

	@Override
	public void moneyBack() {
		System.out.println("钱已退还.");
		candyMachine.setState(candyMachine.getMoneyEmptyState());
	}

	@Override
	public void dispense() {
		System.out.println("请先转动.");
	}

}
