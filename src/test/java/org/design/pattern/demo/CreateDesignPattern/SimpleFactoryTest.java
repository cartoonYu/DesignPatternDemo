package org.design.pattern.demo.CreateDesignPattern;

import org.DesignPatternDemo.CreateDesignPattern.factory.ServiceEnum;
import org.DesignPatternDemo.CreateDesignPattern.factory.SimpleFactory;
import org.DesignPatternDemo.CreateDesignPattern.factory.sample.MultipartServiceImpl;
import org.DesignPatternDemo.CreateDesignPattern.factory.sample.SampleService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2021/12/19 10:45
 */
@DisplayName("simple factory test")
public class SimpleFactoryTest {

    private SimpleFactory simpleFactory = new SimpleFactory();

    @DisplayName("normal test")
    @Test
    public void normalTest(){
        SampleService service = simpleFactory.get(ServiceEnum.MULTIPART.getMethod());
        Assertions.assertTrue(service instanceof MultipartServiceImpl);
    }
}
