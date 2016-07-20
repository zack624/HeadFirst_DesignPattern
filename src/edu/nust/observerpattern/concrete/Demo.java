package edu.nust.observerpattern.concrete;

public class Demo {
	public static void main(String[] args) {
		WeatherSubject weatherSubject = new WeatherSubject();
		Observer cwo = new CurrentWeatherObserver();
		Observer wfo = new WeatherForecaseObserver();
		
		weatherSubject.regist(cwo);
		weatherSubject.regist(wfo);
		weatherSubject.setWeatherData(36.1F, 1000F, 0.5F);
		weatherSubject.setWeatherData(37.6F, 2500F, 0.7F);
	}
}
