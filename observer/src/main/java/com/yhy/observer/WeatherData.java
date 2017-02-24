package com.yhy.observer;

import java.util.ArrayList;

/**
 * Author : YangHaoyi on 2017/2/20.
 * Email  :  yanghaoyi@neusoft.com
 * Description :
 */

public class WeatherData implements Subject{

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>0){
            observers.remove(i);
            System.out.println("Remove one observer");
        }
    }

    @Override
    public void notifyObservers() {
        for(int i = 0;i<observers.size();i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }
    public void serMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
