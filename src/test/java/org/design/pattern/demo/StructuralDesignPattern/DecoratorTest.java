package org.design.pattern.demo.StructuralDesignPattern;

import org.DesignPatternDemo.StructuralDesignPattern.decorator.BufferDecoratorImpl;
import org.DesignPatternDemo.StructuralDesignPattern.decorator.Decorator;
import org.DesignPatternDemo.StructuralDesignPattern.decorator.DecoratorImpl;
import org.design.pattern.demo.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2022/1/8 16:33
 */
@DisplayName("decorator test")
public class DecoratorTest extends BaseTest {

    @DisplayName("normal test")
    @Test
    public void normalTest(){
        Decorator decorator = new DecoratorImpl();
        BufferDecoratorImpl bufferOperate = new BufferDecoratorImpl(decorator);
        bufferOperate.read("example.txt");
    }
}
