package org.design.pattern.demo.CreateDesignPattern.factory;


import org.design.pattern.demo.CreateDesignPattern.factory.sample.SampleService;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/7/19 22:58
 */
public abstract class AbstractFactory {

    public abstract SampleService get(String method);
}
