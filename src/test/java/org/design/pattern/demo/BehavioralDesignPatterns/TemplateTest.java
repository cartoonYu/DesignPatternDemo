package org.design.pattern.demo.BehavioralDesignPatterns;

import org.DesignPatternDemo.BehavioralDesignPatterns.template.Template;
import org.DesignPatternDemo.BehavioralDesignPatterns.template.TemplateImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2022/2/23 19:43
 */
@DisplayName("template test")
public class TemplateTest {

    @DisplayName("normal test")
    @Test
    public void normalTest(){
        Template template = new TemplateImpl();
        template.run("message 1", "message 2");
    }
}
