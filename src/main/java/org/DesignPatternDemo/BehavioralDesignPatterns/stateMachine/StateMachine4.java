package org.DesignPatternDemo.BehavioralDesignPatterns.stateMachine;

/**
 * @author cartoon
 * @date 2021/10/16 23:26
 */
public class StateMachine4 implements StateMachine {

    @Override
    public void convertToStatus4(Model model) {
        if(model.getCurrentStatus().equals(StatusEnum.Status4)){
            StatusToPointEnum pointEnum = StatusToPointEnum.Status4;
            model.setCurrentPoint(model.getCurrentPoint() + pointEnum.getPoint());
        }
    }
}
