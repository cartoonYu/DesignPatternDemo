package demo.BehavioralDesignPatterns.observer.observer;

import demo.BehavioralDesignPatterns.observer.Message;

public interface Observer {

    void receive(Message msg);
}
