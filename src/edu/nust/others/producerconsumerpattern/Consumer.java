package edu.nust.others.producerconsumerpattern;

public class Consumer extends Thread{
	private GoodsManager goodsManager;

	public Consumer(GoodsManager goodsManager) {
		super();
		this.goodsManager = goodsManager;
	}

	@Override
	public void run() {
		for(int i=0 ; i<5 ; i++){
			Goods one = goodsManager.consume();
		}
	}
}
