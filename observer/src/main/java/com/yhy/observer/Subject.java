package com.yhy.observer;

/**
 * Author : YangHaoyi on 2017/2/20.
 * Email  :  yanghaoyi@neusoft.com
 * Description :主题，被观察者的接口，包含注册观察者registerObserver
 * 将自己从观察者中移除，notifyObservers状态改变时更新所有当前观察者
 */

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
