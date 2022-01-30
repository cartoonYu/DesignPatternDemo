package org.design.pattern.demo.StructuralDesignPattern;

import org.DesignPatternDemo.StructuralDesignPattern.composite.OperateService;
import org.DesignPatternDemo.StructuralDesignPattern.composite.OperateServiceImpl;
import org.design.pattern.demo.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2022/1/8 16:25
 */
@DisplayName("composite test")
public class CompositeTest extends BaseTest {

    @DisplayName("normal test")
    @Test
    public void normalTest(){
        OperateService operateService = new OperateServiceImpl();
        operateService.operate("test");
    }
}
