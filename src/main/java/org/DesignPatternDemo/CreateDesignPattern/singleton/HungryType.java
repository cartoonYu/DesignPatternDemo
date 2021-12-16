package org.DesignPatternDemo.CreateDesignPattern.singleton;

/**
 * hungry type singleton, init object when system start
 * @author cartoon
 * @version 1.0
 * @since 2021/7/18 21:30
 */
public class HungryType {

    private static HungryType instance = new HungryType();

    public static HungryType getInstance(){
        return instance;
    }

    private HungryType(){}
}
