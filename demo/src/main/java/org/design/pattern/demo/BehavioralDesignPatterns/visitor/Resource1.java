package org.design.pattern.demo.BehavioralDesignPatterns.visitor;

/**
 * @author cartoon
 * @date 2021/10/30 16:32
 */
public class Resource1 extends Resource{

    public Resource1(String path) {
        super(path);
    }

    @Override
    public void acceptOperation(Visitor visitor) {
        visitor.visit(this);
    }
}
