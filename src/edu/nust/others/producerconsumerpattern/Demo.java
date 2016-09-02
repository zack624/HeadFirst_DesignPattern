package edu.nust.others.producerconsumerpattern;

import java.util.List;
/**
 * 生产者消费者模式
 * @author zack
 * @since  2016年9月2日
 */
public class Demo{
	public static void main(String[] args) {
		GoodsManager goodsManager = new GoodsManager();
		Producter p = new Producter(goodsManager);
		Consumer c = new Consumer(goodsManager);
		p.start();
		c.start();
		
		List<Goods> goods = goodsManager.getGoods();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("缓冲区商品数："+goods.size());
	}
}