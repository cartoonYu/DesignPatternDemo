package org.DesignPatternDemo.BehavioralDesignPatterns.visitor;

/**
 * @author cartoon
 * @date 2021/10/30 16:34
 */
public class Resource2 extends Resource {

    public Resource2(String path) {
        super(path);
    }

    @Override
    public void acceptOperation(Visitor visitor) {
        visitor.visit(this);
    }
}
