package org.DesignPatternDemo.BehavioralDesignPatterns.interpreter;

/**
 * @author cartoon
 * @date 2021/11/27 16:39
 */
public class NumberExpression implements Expression{

    private long number;

    public NumberExpression(long number) {
        this.number = number;
    }

    @Override
    public long intercept() {
        return number;
    }
}
