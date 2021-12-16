package org.DesignPatternDemo.BehavioralDesignPatterns.responsibilityChain;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/10/07 09:41
 */
public class HandleA implements Handler{

    @Override
    public boolean handle(HandlePojo pojo) {
        return true;
    }
}
