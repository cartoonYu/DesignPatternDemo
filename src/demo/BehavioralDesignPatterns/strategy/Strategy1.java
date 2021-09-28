package demo.BehavioralDesignPatterns.strategy;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/28 11:09
 */
public class Strategy1 implements StrategyInterface{

    @Override
    public void function(String msg) {
        System.out.println("strategy1 print: " + msg);
    }
}
