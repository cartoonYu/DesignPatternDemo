package org.design.pattern.demo.BehavioralDesignPatterns;

import org.DesignPatternDemo.BehavioralDesignPatterns.visitor.*;
import org.design.pattern.demo.base.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @version 1.0
 * @since 2022/02/26 00:34
 */
@DisplayName("visitor test")
public class VisitorTest extends BaseTest {

    private static Visitor visitor1;

    private static Visitor visitor2;

    @DisplayName("resource 1 test ")
    @Test
    public void resource1Test(){
        Resource resource = new Resource1("aaa");
        resource.acceptOperation(visitor1);
        resource.acceptOperation(visitor2);
    }

    @DisplayName("resource 2 test ")
    @Test
    public void resource2Test(){
        Resource resource = new Resource2("bbb");
        resource.acceptOperation(visitor1);
        resource.acceptOperation(visitor2);
    }

    @BeforeEach
    public void init(){
        visitor1 = new Visitor1();
        visitor2 = new Visitor1();
    }
}
