package org.design.pattern.demo.CreateDesignPattern;

import org.DesignPatternDemo.CreateDesignPattern.factory.AbstractFactory;
import org.DesignPatternDemo.CreateDesignPattern.factory.AbstractFactoryImpl;
import org.DesignPatternDemo.CreateDesignPattern.factory.ServiceEnum;
import org.DesignPatternDemo.CreateDesignPattern.factory.sample.MultipartServiceImpl;
import org.DesignPatternDemo.CreateDesignPattern.factory.sample.SampleService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2021/12/19 10:43
 */
@DisplayName("abstract factory test")
public class AbstractFactoryTest {

    private AbstractFactory abstractFactory = new AbstractFactoryImpl();

    @DisplayName("normal test")
    @Test
    public void normalTest(){
        SampleService service = abstractFactory.get(ServiceEnum.MULTIPART.getMethod());
        Assertions.assertTrue(service instanceof MultipartServiceImpl);
    }
}
