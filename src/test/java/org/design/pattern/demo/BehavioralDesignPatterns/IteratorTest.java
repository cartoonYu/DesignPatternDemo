package org.design.pattern.demo.BehavioralDesignPatterns;

import org.DesignPatternDemo.BehavioralDesignPatterns.iterator.ArrayCollection;
import org.DesignPatternDemo.BehavioralDesignPatterns.iterator.Collection;
import org.DesignPatternDemo.BehavioralDesignPatterns.iterator.Iterator;
import org.design.pattern.demo.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2022/1/30 22:29
 */
@DisplayName("iterator test")
public class IteratorTest extends BaseTest {

    @DisplayName("normal test")
    @Test
    public void normalTest(){
        Collection<Integer> collection = new ArrayCollection<>();
        collection.add(1);
        collection.add(2);
        Iterator iterator = collection.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.get());
        }
    }
}
