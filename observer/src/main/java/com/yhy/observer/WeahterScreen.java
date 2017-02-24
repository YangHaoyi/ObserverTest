package com.yhy.observer;

/**
 * Author : YangHaoyi on 2017/2/20.
 * Email  :  yanghaoyi@neusoft.com
 * Description :主题实现
 */

public class WeahterScreen implements Observer{

    private Subject weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeahterScreen(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display(temperature,humidity,pressure);
    }
    public void display(float temperature, float humidity, float pressure){
        System.out.println("The screen show :"+"temperature is "+temperature+"C humidity is "+humidity+ "% and pressure is "+pressure);
    }
}
