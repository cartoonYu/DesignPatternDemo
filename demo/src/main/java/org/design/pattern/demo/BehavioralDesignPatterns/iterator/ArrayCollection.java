package org.design.pattern.demo.BehavioralDesignPatterns.iterator;

/**
 * @author cartoon
 * @date 2021/10/23 15:32
 */
public class ArrayCollection<T> implements Collection<T>{

    private Object[] nums;

    private Integer currentIndex;

    @Override
    public int size() {
        return nums.length;
    }

    @Override
    public void add(T data) {
        nums[++currentIndex] = data;
    }

    @Override
    public void remove(int index) {
        Object[] tempNums = new Object[nums.length - 1];
        int tempIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(i != index){
                tempNums[tempIndex] = nums[i];
            }
        }
        if(currentIndex >= index){
            currentIndex -= 1;
        }
        nums = tempNums;
    }

    @Override
    public T get(int index) {
        return (T)nums[index];
    }

    @Override
    public Iterator getIterator() {
        return new ArrayCollectionIterator(this);
    }

    public ArrayCollection() {
        nums = new Object[16];
        currentIndex = 0;
    }
}
