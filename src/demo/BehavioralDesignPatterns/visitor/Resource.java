package demo.BehavioralDesignPatterns.visitor;

/**
 * @author cartoon
 * @date 2021/10/30 16:30
 */
public abstract class Resource {

    private String path;

    public Resource(String path){
        this.path = path;
    }

    public abstract void acceptOperation(Visitor visitor);
}
