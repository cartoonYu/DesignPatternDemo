package org.design.pattern.demo.CreateDesignPattern;

import org.DesignPatternDemo.CreateDesignPattern.prototype.Prototype;
import org.design.pattern.demo.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2021/12/26 22:42
 */
@DisplayName("prototype test")
public class PrototypeTest extends BaseTest {

    @DisplayName("normal prototype test")
    @Test
    public void testNormal(){
        Prototype prototype = new Prototype();
        prototype.refresh();
    }
}
