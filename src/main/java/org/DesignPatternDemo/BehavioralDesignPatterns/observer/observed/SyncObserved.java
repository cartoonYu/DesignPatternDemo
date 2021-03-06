package org.DesignPatternDemo.BehavioralDesignPatterns.observer.observed;


import org.DesignPatternDemo.BehavioralDesignPatterns.observer.Message;
import org.DesignPatternDemo.BehavioralDesignPatterns.observer.ObserverRegister;
import org.DesignPatternDemo.BehavioralDesignPatterns.observer.ObserverRegisterImpl;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/22 23:49
 */
public class SyncObserved implements Observed {

    private ObserverRegister observerRegister;

    @Override
    public void sendMsg(Message message) {
        String msgFormat = "sync send message, timestamp: %d, msg: %s";
        System.out.printf((msgFormat) + "%n", message.getTimestamp(), message.getMsg());
        observerRegister.getAllObserver().forEach(observer -> observer.receive(message));
    }

    public SyncObserved(ObserverRegister observerRegister) {
        this.observerRegister = observerRegister;
    }
}
