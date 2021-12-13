package org.design.pattern.demo.BehavioralDesignPatterns.interpreter;

/**
 * @author cartoon
 * @date 2021/11/27 16:40
 */
public class AddExpression implements Expression{

    private Expression expression1;

    private Expression expression2;

    public AddExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public long intercept() {
        return expression1.intercept() + expression2.intercept();
    }
}
