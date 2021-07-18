package demo.singleton;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/7/18 21:35
 */
public class IdlerType {

    private static IdlerType instance;

    public static synchronized IdlerType getInstance(){
        if(instance == null){
            instance = new IdlerType();
        }
        return instance;
    }

    private IdlerType(){}
}
