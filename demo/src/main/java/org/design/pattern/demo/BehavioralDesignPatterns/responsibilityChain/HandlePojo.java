package org.design.pattern.demo.BehavioralDesignPatterns.responsibilityChain;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/10/07 09:41
 */
public class HandlePojo {

    private Long userId;

    private String userName;

    private String content;

    private Map<Handler, Boolean> handleRes;

    public Long getUserId() {
        return userId;
    }

    public HandlePojo setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public HandlePojo setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getContent() {
        return content;
    }

    public HandlePojo setContent(String content) {
        this.content = content;
        return this;
    }

    public Map<Handler, Boolean> getHandleRes() {
        return handleRes;
    }

    public HandlePojo setHandleRes(Map<Handler, Boolean> handleRes) {
        this.handleRes = handleRes;
        return this;
    }

    public HandlePojo() {
        handleRes = new HashMap<>();
    }
}
