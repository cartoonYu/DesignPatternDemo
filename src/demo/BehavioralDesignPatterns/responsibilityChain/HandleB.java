package demo.BehavioralDesignPatterns.responsibilityChain;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/10/07 09:42
 */
public class HandleB implements Handler{

    @Override
    public boolean handle(HandlePojo pojo) {
        return true;
    }
}
