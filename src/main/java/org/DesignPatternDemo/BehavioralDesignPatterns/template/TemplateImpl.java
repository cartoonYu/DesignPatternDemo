package org.DesignPatternDemo.BehavioralDesignPatterns.template;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/28 11:00
 */
public class TemplateImpl extends Template{

    @Override
    protected void subFunction1(String msg) {
        System.out.println("template impl, " + msg);
    }

    @Override
    protected void subFunction2(String msg) {
        System.out.println("template impl, " + msg);
    }
}
