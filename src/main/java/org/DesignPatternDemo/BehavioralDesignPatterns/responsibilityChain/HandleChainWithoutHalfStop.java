package org.DesignPatternDemo.BehavioralDesignPatterns.responsibilityChain;

import java.util.LinkedList;
import java.util.List;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/10/07 09:51
 */
public class HandleChainWithoutHalfStop implements Handler{

    private List<Handler> handlerList;

    @Override
    public boolean handle(HandlePojo pojo) {
        boolean handleRes = true;
        for(Handler handler : handlerList){
            handleRes = handler.handle(pojo);
            pojo.getHandleRes().put(handler, handleRes);
            System.out.println("handle chain without half stop, handle result: " + handleRes);
        }
        return handleRes;
    }

    public HandleChainWithoutHalfStop() {
        handlerList = new LinkedList<>();
        handlerList.add(new HandleA());
        handlerList.add(new HandleB());
    }
}
