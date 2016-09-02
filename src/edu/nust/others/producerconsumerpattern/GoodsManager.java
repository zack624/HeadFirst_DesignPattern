package edu.nust.others.producerconsumerpattern;

import java.util.ArrayList;
import java.util.List;
/**
 * 中介，负责解耦生产者和消费者，提供缓冲区。
 * <p>缓冲区最终为空。</p>
 * @author zack
 * @since  2016年9月2日
 */
public class GoodsManager {
	//生产者和消费者间的缓冲区
	private static List<Goods> goods = new ArrayList<Goods>();
	
	public synchronized void product(Goods one){
		while(goods.size() >= 10){
			try {
				System.out.println("Full:Store is full,cannot product.");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		goods.add(one);
		System.out.println("product:Producter add a goods"+one.id);
		notify();
	}
	
	public synchronized Goods consume(){
		while(goods.size() > 0){
			Goods one = goods.get(goods.size()-1);
			goods.remove(goods.size()-1);
			System.out.println("consume:Consumer consume a goods"+one.id);
			notify();
		}
		try {
			System.out.println("Empty:Store is empty,cannot consume.");
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static List<Goods> getGoods() {
		return goods;
	}
	
	
}
