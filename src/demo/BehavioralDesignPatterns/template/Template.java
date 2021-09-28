package demo.BehavioralDesignPatterns.template;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/28 10:57
 */
public abstract class Template {


    public void run(String msg1, String msg2){
        subFunction1(msg1);
        subFunction2(msg2);
    }

    protected abstract void subFunction1(String msg);

    protected abstract void subFunction2(String msg);
}
