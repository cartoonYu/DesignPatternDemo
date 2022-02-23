package org.design.pattern.demo.BehavioralDesignPatterns;

import org.DesignPatternDemo.BehavioralDesignPatterns.strategy.StrategyEnum;
import org.DesignPatternDemo.BehavioralDesignPatterns.strategy.StrategyFactory;
import org.DesignPatternDemo.BehavioralDesignPatterns.strategy.StrategyInterface;
import org.design.pattern.demo.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2022/2/23 19:37
 */
@DisplayName("strategy test")
public class StrategyTest extends BaseTest {

    private StrategyFactory strategyFactory = new StrategyFactory();

    @DisplayName("strategy 1 test")
    @Test
    public void strategy1(){
        StrategyInterface strategyInterface = strategyFactory.getStrategy(StrategyEnum.Strategy1);
        strategyInterface.function("strategy 1");
    }

    @DisplayName("strategy 2 test")
    @Test
    public void strategy2(){
        StrategyInterface strategyInterface = strategyFactory.getStrategy(StrategyEnum.Strategy2);
        strategyInterface.function("strategy 2");
    }
}
