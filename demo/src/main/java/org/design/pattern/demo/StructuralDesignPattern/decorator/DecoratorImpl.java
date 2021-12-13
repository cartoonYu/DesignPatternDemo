package org.design.pattern.demo.StructuralDesignPattern.decorator;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/08/22 16:49
 */
public class DecoratorImpl implements Decorator {

    @Override
    public String read(String fileName) {
        return "demoString";
    }
}
