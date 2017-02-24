package com.yhy.observer;

public class Main {
    public static void main(String[] arges){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        WeahterScreen weahterScreen = new WeahterScreen(weatherData);
        weatherData.serMeasurements(30F,12.5F,15F);
        weatherData.removeObserver(weahterScreen);
        weatherData.serMeasurements(36.5F,16F,27.1F);
    }
}
