package org.design.pattern.demo.StructuralDesignPattern;

import org.DesignPatternDemo.StructuralDesignPattern.adapter.DemoService;
import org.DesignPatternDemo.StructuralDesignPattern.adapter.DemoServiceImpl;
import org.DesignPatternDemo.StructuralDesignPattern.adapter.ImplementAdapter;
import org.DesignPatternDemo.StructuralDesignPattern.adapter.InheritAdapter;
import org.DesignPatternDemo.StructuralDesignPattern.agency.AgencyByImplement;
import org.DesignPatternDemo.StructuralDesignPattern.agency.AgencyByInherit;
import org.DesignPatternDemo.StructuralDesignPattern.agency.AgentDemo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author cartoon
 * @date 2022/1/3 15:18
 */
@DisplayName("agency test")
public class AgencyTest {

    @DisplayName("inherit agency normal test")
    @Test
    public void inheritAgencyNormalTest(){
        AgencyByInherit agency = new AgencyByInherit();
        agency.simulate("simulate message");
    }

    @DisplayName("implement agency normal test")
    @Test
    public void implementAgencyNormalTest(){
        AgentDemo agentDemo = new AgentDemo();
        AgencyByImplement agency = new AgencyByImplement(agentDemo);
        agency.simulate("simulate message");
    }


}
