package org.DesignPatternDemo.BehavioralDesignPatterns.iterator;

/**
 * @author cartoon
 * @date 2021/10/23 15:56
 */
public class ArrayCollectionIterator implements Iterator{

    private ArrayCollection arrayCollection;

    private Integer index;

    @Override
    public boolean hasNext() {
        return arrayCollection.size() > index;
    }

    @Override
    public Object get() {
        return arrayCollection.get(index++);
    }

    public ArrayCollectionIterator(ArrayCollection arrayCollection) {
        this.arrayCollection = arrayCollection;
        index = 0;
    }
}
