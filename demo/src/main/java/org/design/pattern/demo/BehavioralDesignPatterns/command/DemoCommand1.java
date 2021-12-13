package org.design.pattern.demo.BehavioralDesignPatterns.command;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/11/13 11:02
 */
public class DemoCommand1 implements Command{

    private CommandData commandData;

    @Override
    public void execute() {
        // execute specific logic
    }

    public DemoCommand1(CommandData commandData) {
        this.commandData = commandData;
    }
}
