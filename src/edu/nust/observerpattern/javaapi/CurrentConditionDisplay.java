package edu.nust.observerpattern.javaapi;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer {
	private Observable subject;
	private double temperature;
	private double humidity;
	
	public CurrentConditionDisplay(Observable o){
		this.subject = o;
		subject.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData wData = (WeatherData) o;
			this.temperature = wData.getTemperature();
			this.humidity = wData.getHumidity();
			display();
		}
	}

	private void display() {
		System.out.println("it shows current weather condition,temperature : "
				+ temperature + ",humidity : " + humidity);
	}

}
