package org.design.pattern.demo.BehavioralDesignPatterns.snapshot;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/11/07 23:50
 */
public class Snapshot {

    private String currentVersionText;

    private Deque<String> snapshotList;

    public void input(String inputData){
        currentVersionText = currentVersionText.concat(inputData);
    }

    public String getText(){
        return currentVersionText;
    }

    public void createSnapshot(){
        snapshotList.addLast(currentVersionText);
    }

    public String restoreLastVersion(){
        if(snapshotList.isEmpty()){
            return currentVersionText;
        }
        currentVersionText = snapshotList.pollLast();
        return currentVersionText;
    }

    public Snapshot() {
        currentVersionText = "";
        snapshotList = new LinkedList<>();
    }
}
