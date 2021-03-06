package org.DesignPatternDemo.CreateDesignPattern.factory;


import org.DesignPatternDemo.CreateDesignPattern.factory.sample.SampleService;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/7/19 22:58
 */
public abstract class AbstractFactory {

    public abstract SampleService get(String method);
}
