package org.design.pattern.demo.CreateDesignPattern.factory.sample;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/7/19 22:50
 */
public class PlusServiceImpl implements SampleService{

    @Override
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }
}
