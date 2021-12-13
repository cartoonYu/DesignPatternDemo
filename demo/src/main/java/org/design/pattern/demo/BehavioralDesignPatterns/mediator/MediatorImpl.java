package org.design.pattern.demo.BehavioralDesignPatterns.mediator;

/**
 * @author cartoon.yu
 * @date 2021/11/27 16:55
 */
public class MediatorImpl implements Mediator{

    private Component component1;

    private Component component2;

    public MediatorImpl(Component component1, Component component2) {
        this.component1 = component1;
        this.component2 = component2;
    }

    @Override
    public void execute(Component component, Event event) {
        if(component == component1 && event.toString().equals("login")){
            component2.execute();
        }
    }
}
