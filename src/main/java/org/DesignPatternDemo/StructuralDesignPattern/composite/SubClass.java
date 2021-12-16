package org.DesignPatternDemo.StructuralDesignPattern.composite;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/07 09:09
 */
public class SubClass implements OperatedObjectService{

    @Override
    public void operate(String msg) {
        System.out.println("sub class return : " + msg);
    }
}
