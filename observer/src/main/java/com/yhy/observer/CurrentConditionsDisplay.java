package com.yhy.observer;

/**
 * Author : YangHaoyi on 2017/2/20.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class CurrentConditionsDisplay implements Observer{

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display(temperature,humidity);
    }
    public void display(float temperature,float humidity){
        System.out.println("Current conditions: "+ temperature + "F degrees and "+humidity+"% humidity");
    }
}
