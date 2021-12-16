package org.DesignPatternDemo.BehavioralDesignPatterns.observer.observer;


import org.DesignPatternDemo.BehavioralDesignPatterns.observer.Message;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/22 22:45
 */
public class Observer2 implements Observer {

    @Override
    public void receive(Message msg) {
        String msgFormat = "observer2 receive message, timestamp: %d, message: %s";
        System.out.printf((msgFormat) + "%n", msg.getTimestamp(), msg.getMsg());
    }
}
