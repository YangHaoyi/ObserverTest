package com.yhy.observer;

/**
 * Author : YangHaoyi on 2017/2/20.
 * Email  :  yanghaoyi@neusoft.com
 * Description :观察者接口，update方法为接收到被观察者消息，当主题（被观察者）状态改变时，更新观察者
 */

public interface Observer {
    void update(float temperature,float humidity,float pressure);
}
