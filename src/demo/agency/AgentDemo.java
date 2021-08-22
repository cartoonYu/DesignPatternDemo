package demo.agency;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/08/18 00:24
 */
public class AgentDemo implements Agent{

    @Override
    public void simulate(String msg) {
        System.out.println("agent demo, msg:  " + msg);
    }
}
