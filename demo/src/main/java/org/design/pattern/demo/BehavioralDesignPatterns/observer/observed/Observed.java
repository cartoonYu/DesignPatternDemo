package org.design.pattern.demo.BehavioralDesignPatterns.observer.observed;


import org.design.pattern.demo.BehavioralDesignPatterns.observer.Message;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/22 22:45
 */
public interface Observed {

    void sendMsg(Message message);
}
