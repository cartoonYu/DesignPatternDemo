package org.design.pattern.demo.CreateDesignPattern.prototype;

public interface CopyService{

    <T>T copy(T obj, Class<T> classType);
}
