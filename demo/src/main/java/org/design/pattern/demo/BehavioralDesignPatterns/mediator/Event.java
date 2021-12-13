package org.design.pattern.demo.BehavioralDesignPatterns.mediator;

/**
 * @author cartoon
 * @date 2021/11/27 16:53
 */
public class Event {

    private String eventName;

    public Event(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return eventName;
    }
}
