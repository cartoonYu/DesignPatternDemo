package org.design.pattern.demo.StructuralDesignPattern;

import org.DesignPatternDemo.StructuralDesignPattern.flyWeight.FlyWeightFactory;
import org.DesignPatternDemo.StructuralDesignPattern.flyWeight.FlyWeightUnit;
import org.design.pattern.demo.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2022/1/16 16:27
 */
@DisplayName("fly weight test")
public class FlyWeightTest extends BaseTest {

    @DisplayName("normal test")
    @Test
    public void normalTest(){
        FlyWeightUnit flyWeightUnit = FlyWeightFactory.getFlyWeight(200);
    }
}
