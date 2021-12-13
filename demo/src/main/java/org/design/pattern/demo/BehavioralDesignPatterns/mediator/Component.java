package org.design.pattern.demo.BehavioralDesignPatterns.mediator;

/**
 * @author cartoon
 * @date 2021/11/27 16:51
 */
public class Component {

    private String name;

    public Component(String name) {
        this.name = name;
    }

    public void execute(){
        //execute something
    }

    @Override
    public String toString() {
        return name;
    }
}
