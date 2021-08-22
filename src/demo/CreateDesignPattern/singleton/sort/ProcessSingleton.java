package demo.CreateDesignPattern.singleton.sort;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/7/18 21:50
 */
public class ProcessSingleton {

    private static volatile ProcessSingleton instance;

    public static ProcessSingleton getInstance(){
        if(instance == null){
            synchronized (ProcessSingleton.class){
                if(instance == null){
                    instance = new ProcessSingleton();
                }
            }
        }
        return instance;
    }

    private ProcessSingleton(){}
}
