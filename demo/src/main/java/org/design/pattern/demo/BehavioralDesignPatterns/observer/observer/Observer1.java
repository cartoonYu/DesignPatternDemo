package org.design.pattern.demo.BehavioralDesignPatterns.observer.observer;


import org.design.pattern.demo.BehavioralDesignPatterns.observer.Message;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/22 22:44
 */
public class Observer1 implements Observer {

    @Override
    public void receive(Message msg) {
        String msgFormat = "observer1 receive message, timestamp: %d, message: %s";
        System.out.printf((msgFormat) + "%n", msg.getTimestamp(), msg.getMsg());
    }
}
