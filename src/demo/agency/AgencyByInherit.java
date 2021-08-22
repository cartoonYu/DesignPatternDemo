package demo.agency;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/08/18 00:25
 */
public class AgencyByInherit extends AgentDemo{

    @Override
    public void simulate(String msg) {
        System.out.println("demo.agency agent demo by inherit, print msg");
        super.simulate(msg);
    }
}
