package org.design.pattern.demo.StructuralDesignPattern;

import org.DesignPatternDemo.StructuralDesignPattern.facade.FacadeService;
import org.DesignPatternDemo.StructuralDesignPattern.facade.FacadeServiceImpl;
import org.design.pattern.demo.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2022/1/16 16:22
 */
@DisplayName("facade test")
public class FacadeTest extends BaseTest {

    @DisplayName("normal test")
    @Test
    public void normalTest(){
        FacadeService facadeService = new FacadeServiceImpl();
        facadeService.operate("test1", "test2");
    }
}
