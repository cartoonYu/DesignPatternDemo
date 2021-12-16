package org.DesignPatternDemo.StructuralDesignPattern.bridge;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/08/22 16:17
 */
public class ServerImpl implements Server{

    @Override
    public boolean auth(String userName, String password) {
        // call specific api to auth
        return true;
    }
}

