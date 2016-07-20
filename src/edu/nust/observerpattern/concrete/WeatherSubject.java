package edu.nust.observerpattern.concrete;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject {
//	观察者列表
	private List<Observer> observers;
//	表示change的状态
	private boolean flag = false;
	
	private float temp;
	private float pressure;
	private float humidity;
	
	
	public WeatherSubject() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void regist(Observer o) {
		observers.add(o);
	}

	@Override
	public void remove(Observer o) {
		if(observers.contains(o)){
			observers.remove(o);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.updata(this);
		}
	}
	
	public void setWeatherData(float tem,float pre,float hum){
		this.temp = tem;
		this.pressure = pre;
		this.humidity = hum;
		weatherChange();
	}

	public void weatherChange() {
		setChange();
		notifyObservers();
	}

	public void setChange() {
		this.flag = true;
	}

	public float getTemp() {
		return temp;
	}

	public float getPressure() {
		return pressure;
	}

	public float getHumidity() {
		return humidity;
	}
	
	

}
