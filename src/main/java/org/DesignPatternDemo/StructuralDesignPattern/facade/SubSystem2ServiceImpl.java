package org.DesignPatternDemo.StructuralDesignPattern.facade;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/07 08:55
 */
public class SubSystem2ServiceImpl implements SubSystem2Service {

    @Override
    public String operate(String msg) {
        return "subsystem 2 return: " + msg;
    }
}
