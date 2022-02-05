package org.design.pattern.demo.BehavioralDesignPatterns;

import org.DesignPatternDemo.BehavioralDesignPatterns.responsibilityChain.HandleChainWithHalfStop;
import org.DesignPatternDemo.BehavioralDesignPatterns.responsibilityChain.HandleChainWithoutHalfStop;
import org.DesignPatternDemo.BehavioralDesignPatterns.responsibilityChain.HandlePojo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2022/2/5 17:15
 */
@DisplayName("handle chain test")
public class HandleChainTest {

    @DisplayName("handle chain with half stop normal test")
    @Test
    public void handleChainWithHalfStopNormalTest(){
        HandlePojo handlePojo = new HandlePojo();
        HandleChainWithHalfStop handleChain = new HandleChainWithHalfStop();
        handleChain.handle(handlePojo);
    }

    @DisplayName("handle chain without half stop normal test")
    @Test
    public void handleChainWithoutHalfStopNormalTest(){
        HandlePojo handlePojo = new HandlePojo();
        HandleChainWithoutHalfStop handleChain = new HandleChainWithoutHalfStop();
        handleChain.handle(handlePojo);
    }
}
