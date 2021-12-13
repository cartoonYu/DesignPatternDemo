package org.design.pattern.demo.BehavioralDesignPatterns;

import org.design.pattern.demo.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/**
 * @author cartoon
 * @date 2021/12/13 20:11
 */
public class Test1 extends BaseTest {

    @Test
    public void test(){
        Assertions.assertTrue(1 != 0);
    }
}
