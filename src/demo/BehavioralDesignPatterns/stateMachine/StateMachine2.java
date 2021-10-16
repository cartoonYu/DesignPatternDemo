package demo.BehavioralDesignPatterns.stateMachine;

/**
 * @author cartoon
 * @date 2021/10/16 23:24
 */
public class StateMachine2 implements StateMachine{

    @Override
    public void convertToStatus2(Model model) {
        if(model.getCurrentStatus().equals(StatusEnum.Status2)){
            StatusToPointEnum pointEnum = StatusToPointEnum.Status2;
            model.setCurrentPoint(model.getCurrentPoint() + pointEnum.getPoint());
        }
    }
}
