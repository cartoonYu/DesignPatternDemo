package org.design.pattern.demo.StructuralDesignPattern.bridge;

public interface Client {

    boolean auth(String userName, String password);

    Auth getAuth();
}
