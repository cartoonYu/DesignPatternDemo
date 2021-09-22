package demo.BehavioralDesignPatterns.observer.observed;

import demo.BehavioralDesignPatterns.observer.Message;
import demo.BehavioralDesignPatterns.observer.ObserverRegister;

import java.util.concurrent.*;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/23 00:36
 */
public class AsyncObserved implements Observed{

    private ObserverRegister observerRegister;

    private ThreadPoolExecutor executor;

    @Override
    public void sendMsg(Message message) {
        String msgFormat = "async send message, timestamp: %d, msg: %s";
        System.out.printf((msgFormat) + "%n", message.getTimestamp(), message.getMsg());
        observerRegister.getAllObserver().forEach(observer -> executor.execute(() -> observer.receive(message)));
    }

    public AsyncObserved(ObserverRegister observerRegister) {
        this.observerRegister = observerRegister;
        executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
    }
}
