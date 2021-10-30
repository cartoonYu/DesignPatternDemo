package demo.BehavioralDesignPatterns.visitor;

/**
 * @author cartoon
 * @date 2021/10/30 16:35
 */
public class Visitor1 implements Visitor{

    @Override
    public void visit(Resource1 resource1) {
        System.out.println("visitor1 visit resource1");
    }

    @Override
    public void visit(Resource2 resource2) {
        System.out.println("visitor1 visit resource2");
    }
}
