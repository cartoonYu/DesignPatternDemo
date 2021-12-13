package org.design.pattern.demo.BehavioralDesignPatterns.iterator;

/**
 * @author cartoon
 * @date 2021/10/23 15:29
 */
public interface Collection<T> {

    int size();

    void add(T data);

    void remove(int index);

    T get(int index);

    Iterator getIterator();
}
