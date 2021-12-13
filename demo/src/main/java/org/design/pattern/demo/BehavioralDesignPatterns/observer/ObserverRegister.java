package org.design.pattern.demo.BehavioralDesignPatterns.observer;


import org.design.pattern.demo.BehavioralDesignPatterns.observer.observer.Observer;

import java.util.List;

public interface ObserverRegister {

    void addObserver(Observer observer);

    void addObserver(Observer... observers);

    void removeObserver(Observer observer);

    List<Observer> getAllObserver();
}
