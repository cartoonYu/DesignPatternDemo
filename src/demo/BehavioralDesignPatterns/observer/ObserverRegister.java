package demo.BehavioralDesignPatterns.observer;

import demo.BehavioralDesignPatterns.observer.observer.Observer;

import java.util.List;

public interface ObserverRegister {

    void addObserver(Observer observer);

    void addObserver(Observer... observers);

    void removeObserver(Observer observer);

    List<Observer> getAllObserver();
}
