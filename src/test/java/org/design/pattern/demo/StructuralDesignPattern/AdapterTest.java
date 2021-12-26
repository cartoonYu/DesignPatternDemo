package org.design.pattern.demo.StructuralDesignPattern;

import org.DesignPatternDemo.StructuralDesignPattern.adapter.DemoService;
import org.DesignPatternDemo.StructuralDesignPattern.adapter.DemoServiceImpl;
import org.DesignPatternDemo.StructuralDesignPattern.adapter.ImplementAdapter;
import org.DesignPatternDemo.StructuralDesignPattern.adapter.InheritAdapter;
import org.design.pattern.demo.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2021/12/26 22:44
 */
@DisplayName("adapter test")
public class AdapterTest extends BaseTest {

    @DisplayName("inherit adapter normal test")
    @Test
    public void inheritAdapterNormalTest(){
        InheritAdapter inheritAdapter = new InheritAdapter();
        inheritAdapter.adapterMethod("simulate message");
    }

    @DisplayName("implement adapter normal test")
    @Test
    public void implementAdapterNormalTest(){
        DemoService demoService = new DemoServiceImpl();
        ImplementAdapter implementAdapter = new ImplementAdapter(demoService);
        implementAdapter.adapterMethod("simulate message");
    }
}
