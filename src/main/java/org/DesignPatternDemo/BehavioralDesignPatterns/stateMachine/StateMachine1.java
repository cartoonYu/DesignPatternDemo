package org.DesignPatternDemo.BehavioralDesignPatterns.stateMachine;

/**
 * @author cartoon
 * @date 2021/10/16 23:18
 */
public class StateMachine1 implements StateMachine {

    @Override
    public void convertToStatus1(Model model) {
        if(model.getCurrentStatus().equals(StatusEnum.Status1)){
            StatusToPointEnum pointEnum = StatusToPointEnum.Status1;
            model.setCurrentPoint(model.getCurrentPoint() + pointEnum.getPoint());
        }
    }
}
