package org.design.pattern.demo.BehavioralDesignPatterns.observer.observer;

import org.design.pattern.demo.BehavioralDesignPatterns.observer.Message;

public interface Observer {

    void receive(Message msg);
}
