package org.DesignPatternDemo.StructuralDesignPattern.adapter;

import java.util.Random;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/06 08:11
 */
public class DemoServiceImpl implements DemoService {

    public String adapterMethod(String msg){
        System.out.println("to be adapter");
        Random random = new Random();
        return msg + random.nextInt();
    }

    public String process(String msg){
        System.out.println(msg);
        return msg;
    }
}
