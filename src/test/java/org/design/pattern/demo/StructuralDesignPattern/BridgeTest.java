package org.design.pattern.demo.StructuralDesignPattern;

import org.DesignPatternDemo.StructuralDesignPattern.bridge.Client;
import org.DesignPatternDemo.StructuralDesignPattern.bridge.ClientImpl;
import org.design.pattern.demo.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2022/1/3 15:32
 */
@DisplayName("bridge test")
public class BridgeTest extends BaseTest {

    @DisplayName("normal test")
    @Test
    public void bridgeNormalTest(){
        Client client = new ClientImpl();
        client.auth("cartoon", "cartoon");
    }
}
