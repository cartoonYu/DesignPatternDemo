package org.design.pattern.demo.StructuralDesignPattern.bridge;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/08/22 16:01
 */
public class Auth {

    private String userName;

    private String password;

    public String getUserName() {
        return userName;
    }

    public Auth setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Auth setPassword(String password) {
        this.password = password;
        return this;
    }
}
