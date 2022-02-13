package org.design.pattern.demo.BehavioralDesignPatterns;

import org.DesignPatternDemo.BehavioralDesignPatterns.snapshot.Snapshot;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2022/2/13 21:29
 */
@DisplayName("snapshot test")
public class SnapshotTest {

    @DisplayName("normal test")
    @Test
    public void normalTest(){
        Snapshot snapshot = new Snapshot();
        snapshot.input("data");
        snapshot.createSnapshot();
        snapshot.restoreLastVersion();
        System.out.println(snapshot.getText());
    }
}
