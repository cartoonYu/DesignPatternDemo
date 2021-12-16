package org.DesignPatternDemo.BehavioralDesignPatterns.strategy;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/28 11:09
 */
public class Strategy2 implements StrategyInterface {

    @Override
    public void function(String msg) {
        System.out.println("strategy2 print: " + msg);
    }
}
