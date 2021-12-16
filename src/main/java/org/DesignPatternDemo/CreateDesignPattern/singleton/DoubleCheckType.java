package org.DesignPatternDemo.CreateDesignPattern.singleton;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/7/18 21:37
 */
public class DoubleCheckType {

    private static volatile DoubleCheckType instance;

    public static DoubleCheckType getInstance(){
        if(instance == null){
            synchronized (DoubleCheckType.class){
                if(instance == null){
                    instance = new DoubleCheckType();
                }
            }
        }
        return instance;
    }

    private DoubleCheckType(){}
}
