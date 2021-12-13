package org.design.pattern.demo.BehavioralDesignPatterns.observer;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/22 22:47
 */
public class Message {

    private Long timestamp;

    private String msg;

    public Long getTimestamp() {
        return timestamp;
    }

    public Message setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Message setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Message(Long timestamp, String msg) {
        this.timestamp = timestamp;
        this.msg = msg;
    }
}
