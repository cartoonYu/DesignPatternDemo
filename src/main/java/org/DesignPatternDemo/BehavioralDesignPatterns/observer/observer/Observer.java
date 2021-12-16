package org.DesignPatternDemo.BehavioralDesignPatterns.observer.observer;


import org.DesignPatternDemo.BehavioralDesignPatterns.observer.Message;

public interface Observer {

    void receive(Message msg);
}
