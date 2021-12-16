package org.DesignPatternDemo.BehavioralDesignPatterns.strategy;

public enum StrategyEnum {

    Strategy1(Strategy1.class, new Strategy1()),
    Strategy2(Strategy2.class, new Strategy2());

    private Class<?> classType;

    private StrategyInterface implementStrategy;

    public Class<?> getClassType() {
        return classType;
    }

    public StrategyInterface getImplementStrategy() {
        return implementStrategy;
    }

    StrategyEnum(Class<?> classType, StrategyInterface strategyInterface) {
        this.classType = classType;
        this.implementStrategy = strategyInterface;
    }
}
