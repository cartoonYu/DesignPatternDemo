package org.design.pattern.demo.BehavioralDesignPatterns;

import org.DesignPatternDemo.BehavioralDesignPatterns.observer.Message;
import org.DesignPatternDemo.BehavioralDesignPatterns.observer.ObserverRegister;
import org.DesignPatternDemo.BehavioralDesignPatterns.observer.ObserverRegisterImpl;
import org.DesignPatternDemo.BehavioralDesignPatterns.observer.observed.AsyncObserved;
import org.DesignPatternDemo.BehavioralDesignPatterns.observer.observed.SyncObserved;
import org.DesignPatternDemo.BehavioralDesignPatterns.observer.observer.Observer1;
import org.DesignPatternDemo.BehavioralDesignPatterns.observer.observer.Observer2;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2022/2/5 17:06
 */
@DisplayName("observed test")
public class ObservedTest {

    private static ObserverRegister observerRegister;

    @DisplayName("async observed test")
    @Test
    public void asyncObservedNormalTest(){
        AsyncObserved asyncObserved = new AsyncObserved(observerRegister);
        asyncObserved.sendMsg(new Message(System.currentTimeMillis(), "simulation message"));
    }

    @DisplayName("sync observed test")
    @Test
    public void syncObservedNormalTest(){
        SyncObserved syncObserved = new SyncObserved(observerRegister);
        syncObserved.sendMsg(new Message(System.currentTimeMillis(), "simulation message"));
    }

    @BeforeAll
    public static void init(){
        observerRegister = new ObserverRegisterImpl();
        observerRegister.addObserver(new Observer1(), new Observer2());
    }
}
