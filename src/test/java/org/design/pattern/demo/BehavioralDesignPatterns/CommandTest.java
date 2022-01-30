package org.design.pattern.demo.BehavioralDesignPatterns;

import org.DesignPatternDemo.BehavioralDesignPatterns.command.Command;
import org.DesignPatternDemo.BehavioralDesignPatterns.command.CommandData;
import org.DesignPatternDemo.BehavioralDesignPatterns.command.DemoCommand1;
import org.design.pattern.demo.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2022/1/22 17:30
 */
@DisplayName("command test")
public class CommandTest extends BaseTest {

    @DisplayName("normal test")
    @Test
    public void normalTest(){
        CommandData commandData = new CommandData();
        commandData.setUserId(111L)
                .setToStatus(1)
                .setFromStatus(0);
        Command command = new DemoCommand1(commandData);
        command.execute();
    }
}
