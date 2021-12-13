package org.design.pattern.demo.BehavioralDesignPatterns.stateMachine;

/**
 * @author cartoon
 * @date 2021/10/16 23:10
 */
public interface StateMachine {

    default void convertToStatus1(Model model){}

    default void  convertToStatus2(Model model){}

    default void convertToStatus3(Model model){}

    default void  convertToStatus4(Model model){}
}
