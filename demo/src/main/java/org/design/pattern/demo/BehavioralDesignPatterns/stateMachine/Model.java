package org.design.pattern.demo.BehavioralDesignPatterns.stateMachine;

/**
 * @author cartoon
 * @date 2021/10/16 23:17
 */
public class Model  {

    private StatusEnum currentStatus;

    private Integer currentPoint;

    public StatusEnum getCurrentStatus() {
        return currentStatus;
    }

    public Model setCurrentStatus(StatusEnum currentStatus) {
        this.currentStatus = currentStatus;
        return this;
    }

    public Integer getCurrentPoint() {
        return currentPoint;
    }

    public Model setCurrentPoint(Integer currentPoint) {
        this.currentPoint = currentPoint;
        return this;
    }
}
