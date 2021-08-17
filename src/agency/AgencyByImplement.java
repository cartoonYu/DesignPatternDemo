package agency;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/08/18 00:26
 */
public class AgencyByImplement implements Agent{

    private AgentDemo agentDemo;

    @Override
    public void simulate(String msg) {
        System.out.println("agency agent demo by implement, print msg");
        agentDemo.simulate(msg);
    }

    public AgencyByImplement(AgentDemo agentDemo) {
        this.agentDemo = agentDemo;
    }
}
