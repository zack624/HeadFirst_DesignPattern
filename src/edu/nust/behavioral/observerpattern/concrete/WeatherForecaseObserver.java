package edu.nust.behavioral.observerpattern.concrete;

public class WeatherForecaseObserver implements Observer {
	private float pressure;
	
	@Override
	public void updata(Object o) {
		if(o instanceof WeatherSubject){
			WeatherSubject ws = (WeatherSubject) o;
			this.pressure = ws.getPressure();
			display();
		}
	}

	public void display() {
		System.out.println("WeatherForecase:pressure:" + this.pressure);
	}

}
