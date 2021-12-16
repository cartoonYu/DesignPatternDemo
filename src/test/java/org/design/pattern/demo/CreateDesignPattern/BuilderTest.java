package org.design.pattern.demo.CreateDesignPattern;

import org.DesignPatternDemo.CreateDesignPattern.builder.BuilderPojo;
import org.junit.Rule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2021/12/16 09:01
 */
@DisplayName("builder pattern test")
public class BuilderTest {

    @DisplayName("normal test")
    @Test
    public void normal(){
        BuilderPojo.build(3, "cartoon");
    }

    @DisplayName("illegal age test")
    @Test
    public void testWithIllegalAge(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> BuilderPojo.build(-1, "cartoon"));
        Assertions.assertEquals("age must legal", exception.getMessage());
    }

    @DisplayName("illegal name test")
    @Test
    public void testWithIllegalName(){
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> BuilderPojo.build(3, null));
        Assertions.assertEquals("name must legal", exception.getMessage());
    }
}
