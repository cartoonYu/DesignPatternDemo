package org.DesignPatternDemo.CreateDesignPattern.singleton;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/7/18 21:40
 */
public class StaticInnerType {

    private static class StaticInnerHolder{
        private static final StaticInnerType instance = new StaticInnerType();
    }

    private static StaticInnerType getInstance(){
        return StaticInnerHolder.instance;
    }

    private StaticInnerType(){}
}
