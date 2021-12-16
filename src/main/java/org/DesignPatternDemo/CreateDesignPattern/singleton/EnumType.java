package org.DesignPatternDemo.CreateDesignPattern.singleton;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/7/18 21:42
 */
public enum EnumType {

    INSTANCE;

    public static EnumType getInstance(){
        return INSTANCE;
    }

    private EnumType(){}
}
