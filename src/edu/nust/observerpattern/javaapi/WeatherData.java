package edu.nust.observerpattern.javaapi;

import java.util.Observable;

public class WeatherData extends Observable {
	private double temperature;
	private double humidity;
	private double pressure;
	
	public void setMeasurements(double tem,double hum,double pre){
		this.temperature = tem;
		this.humidity = hum;
		this.pressure = pre;
		
		measurementsChanged();
	}

	private void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public double getTemperature() {
		return temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public double getPressure() {
		return pressure;
	}
	
	
}
