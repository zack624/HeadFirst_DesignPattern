package edu.nust.behavioral.observerpattern.javaapi;

/**
 * 观察者模式（Observer Pattern）
 * 使用java API设计
 * @author zack
 * @since 2016年7月13日
 */
public class Demo {
	public static void main(String[] args) {
		WeatherData wData = new WeatherData();
		CurrentConditionDisplay c = new CurrentConditionDisplay(wData);
		wData.setMeasurements(38.5, 0.6, 1500);
		
	}
}
