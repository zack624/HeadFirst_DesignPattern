package edu.nust.others.producerconsumerpattern;

public class Producter extends Thread{
	private GoodsManager goodsManager;

	public Producter(GoodsManager goodsManager) {
		super();
		this.goodsManager = goodsManager;
	}

	@Override
	public void run() {
		for(int i=0 ; i<10 ; i++){
			Goods one = new Goods(i);
			goodsManager.product(one);
		}
	}
}




