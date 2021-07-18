package demo.singleton.sort;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/7/18 21:44
 */
public class ThreadSingleton {

    private static final ThreadLocal<ThreadSingleton> instances = new ThreadLocal<>();

    public static ThreadSingleton getInstance(){
        if(instances.get() == null){
            synchronized(ThreadSingleton.class){
                if(instances.get() == null){
                    ThreadSingleton threadSingleton = new ThreadSingleton();
                    instances.set(threadSingleton);
                }
            }
        }
        return instances.get();
    }
}
