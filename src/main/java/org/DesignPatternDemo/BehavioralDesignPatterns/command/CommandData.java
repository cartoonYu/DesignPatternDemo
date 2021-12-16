package org.DesignPatternDemo.BehavioralDesignPatterns.command;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/11/13 11:03
 */
public class CommandData {

    private Long userId;

    private Integer fromStatus;

    private Integer toStatus;

    public Long getUserId() {
        return userId;
    }

    public CommandData setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Integer getFromStatus() {
        return fromStatus;
    }

    public CommandData setFromStatus(Integer fromStatus) {
        this.fromStatus = fromStatus;
        return this;
    }

    public Integer getToStatus() {
        return toStatus;
    }

    public CommandData setToStatus(Integer toStatus) {
        this.toStatus = toStatus;
        return this;
    }
}
