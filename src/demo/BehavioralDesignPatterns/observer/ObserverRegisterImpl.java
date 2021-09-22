package demo.BehavioralDesignPatterns.observer;

import demo.BehavioralDesignPatterns.observer.observer.Observer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/23 00:20
 */
public class ObserverRegisterImpl implements ObserverRegister{

    private List<Observer> observerList;

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void addObserver(Observer... observers) {
        observerList.addAll(Arrays.asList(observers));
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public List<Observer> getAllObserver() {
        return observerList;
    }

    public ObserverRegisterImpl() {
        this.observerList = new LinkedList<>();
    }
}
