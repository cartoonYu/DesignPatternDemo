package org.design.pattern.demo.BehavioralDesignPatterns;

import org.DesignPatternDemo.BehavioralDesignPatterns.mediator.Component;
import org.DesignPatternDemo.BehavioralDesignPatterns.mediator.Event;
import org.DesignPatternDemo.BehavioralDesignPatterns.mediator.Mediator;
import org.DesignPatternDemo.BehavioralDesignPatterns.mediator.MediatorImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2022/1/30 22:36
 */
@DisplayName("mediator test")
public class MediatorTest {

    @DisplayName("normal test")
    @Test
    public void normalTest(){
        Event event = new Event("add order");
        Component component1 = new Component("component1");
        Component component2 = new Component("component2");
        Mediator mediator = new MediatorImpl(component1, component2);
        mediator.execute(component1, event);
    }
}
