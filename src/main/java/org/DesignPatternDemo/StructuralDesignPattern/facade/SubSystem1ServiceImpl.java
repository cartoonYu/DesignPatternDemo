package org.DesignPatternDemo.StructuralDesignPattern.facade;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/07 08:55
 */
public class SubSystem1ServiceImpl implements SubSystem1Service {

    @Override
    public String operate(String msg) {
        return "subsystem 1 return: " + msg;
    }
}
