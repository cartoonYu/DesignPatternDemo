package demo.BehavioralDesignPatterns.strategy;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/28 11:13
 */
public class StrategyFactory {


    private Map<Class<?>, StrategyInterface> strategyMap;

    private List<StrategyEnum> strategyList;

    public StrategyInterface getStrategy(StrategyEnum strategyEnum){
        Optional<StrategyEnum> strategy =  strategyList.stream().filter(strategyEnum1 -> strategyEnum1.getClassType().isAssignableFrom(strategyEnum.getClassType())).findAny();
        return strategy.map(strategyEnum1 -> {
            Class<?> classType = strategyEnum1.getClassType();
            try {
                return (StrategyInterface)classType.newInstance();
            } catch (Exception e){
                System.out.println("strategy factory, new instance error, " + e.getMessage());
                return null;
            }
        }).orElse(null);
    }

    public StrategyFactory(){
        strategyList = Arrays.asList(StrategyEnum.values());
        strategyMap = Arrays.stream(StrategyEnum.values()).collect(Collectors.toMap(StrategyEnum::getClassType, StrategyEnum::getImplementStrategy));
    }
}
