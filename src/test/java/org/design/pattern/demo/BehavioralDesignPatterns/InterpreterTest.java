package org.design.pattern.demo.BehavioralDesignPatterns;

import org.DesignPatternDemo.BehavioralDesignPatterns.interpreter.AddExpression;
import org.DesignPatternDemo.BehavioralDesignPatterns.interpreter.Expression;
import org.DesignPatternDemo.BehavioralDesignPatterns.interpreter.NumberExpression;
import org.design.pattern.demo.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2022/1/23 15:30
 */
@DisplayName("interpreter test")
public class InterpreterTest extends BaseTest {


    @DisplayName("normal test")
    @Test
    public void normalTest(){
        Expression expression1 = new NumberExpression(2);
        Expression expression2 = new NumberExpression(2);
        Expression expression = new AddExpression(expression1, expression2);
        expression.intercept();
    }
}
