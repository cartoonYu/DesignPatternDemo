package org.design.pattern.demo.BehavioralDesignPatterns.visitor;

/**
 * @author cartoon
 * @date 2021/10/30 16:30
 */
public interface Visitor {

    void visit(Resource1 resource1);

    void visit(Resource2 resource2);
}
