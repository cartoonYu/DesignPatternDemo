package org.design.pattern.demo.BehavioralDesignPatterns;

import org.DesignPatternDemo.BehavioralDesignPatterns.stateMachine.Model;
import org.DesignPatternDemo.BehavioralDesignPatterns.stateMachine.StateMachine;
import org.DesignPatternDemo.BehavioralDesignPatterns.stateMachine.StateMachine1;
import org.DesignPatternDemo.BehavioralDesignPatterns.stateMachine.StatusEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2022/2/13 21:35
 */
@DisplayName("state machine test")
public class StateMachineTest {

    @DisplayName("normal test")
    @Test
    public void normalTest(){
        Model model = new Model();
        model.setCurrentStatus(StatusEnum.Status1)
                .setCurrentPoint(100);
        StateMachine stateMachine = new StateMachine1();
        stateMachine.convertToStatus1(model);
    }
}
