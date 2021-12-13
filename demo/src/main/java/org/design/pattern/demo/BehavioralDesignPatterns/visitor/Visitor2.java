package org.design.pattern.demo.BehavioralDesignPatterns.visitor;

/**
 * @author cartoon
 * @date 2021/10/30 16:36
 */
public class Visitor2 implements Visitor {

    @Override
    public void visit(Resource1 resource1) {
        System.out.println("visitor2 visit resource1");
    }

    @Override
    public void visit(Resource2 resource2) {
        System.out.println("visitor2 visit resource2");
    }
}
