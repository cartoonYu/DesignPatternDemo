package org.design.pattern.demo.StructuralDesignPattern.adapter;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/06 08:13
 */
public class InheritAdapter extends DemoServiceImpl {

    @Override
    public String adapterMethod(String msg) {
        System.out.println("adapter");
        return super.adapterMethod(msg);
    }
}
