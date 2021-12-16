package org.DesignPatternDemo.BehavioralDesignPatterns.stateMachine;

import java.util.Arrays;

/**
 * @author cartoon
 * @date 2021/10/16 23:13
 */
public enum StatusToPointEnum {

    Status1(StatusEnum.Status1, 100),
    Status2(StatusEnum.Status2, 200),
    Status3(StatusEnum.Status3, 300),
    Status4(StatusEnum.Status4, 400);

    private StatusEnum status;

    private Integer point;

    StatusToPointEnum(StatusEnum status, Integer point) {
        this.status = status;
        this.point = point;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public Integer getPoint() {
        return point;
    }

    public static StatusToPointEnum get(StatusEnum statusEnum){
        return Arrays.stream(StatusToPointEnum.values())
                .filter(statusToPointEnum -> statusToPointEnum.getStatus().getStatus().equals(statusEnum.getStatus()))
                .findAny()
                .orElse(null);
    }
}
