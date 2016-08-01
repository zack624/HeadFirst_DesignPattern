package edu.nust.behavioral.observerpattern.concrete;

public class CurrentWeatherObserver implements Observer {
	private float pressure;
	private float humidity;
	
	
	
	@Override
	public void updata(Object o) {
		if(o instanceof WeatherSubject){
			WeatherSubject ws = (WeatherSubject) o;
			this.pressure = ws.getPressure();
			this.humidity = ws.getHumidity();
			display();
		}

	}



	public void display() {
		System.out.println("CurrentWeather: pressure:" + this.pressure + ",humidity:" + this.humidity);
	}

}
