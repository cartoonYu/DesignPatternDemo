package org.design.pattern.demo.BehavioralDesignPatterns.stateMachine;

/**
 * @author cartoon
 * @date 2021/10/16 23:25
 */
public class StateMachine3 implements StateMachine {

    @Override
    public void convertToStatus3(Model model) {
        if(model.getCurrentStatus().equals(StatusEnum.Status3)){
            StatusToPointEnum pointEnum = StatusToPointEnum.Status3;
            model.setCurrentPoint(model.getCurrentPoint() + pointEnum.getPoint());
        }
    }
}
