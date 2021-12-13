package org.design.pattern.demo.BehavioralDesignPatterns.responsibilityChain;

import java.util.LinkedList;
import java.util.List;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/10/07 09:42
 */
public class HandleChainWithHalfStop implements Handler{

    private List<Handler> handlerList;

    @Override
    public boolean handle(HandlePojo pojo) {
        boolean handleRes;
        for(Handler handler : handlerList){
            handleRes = handler.handle(pojo);
            pojo.getHandleRes().put(handler, handleRes);
            if(!handleRes){
                return false;
            }
        }
        return true;
    }

    public HandleChainWithHalfStop() {
        handlerList = new LinkedList<>();
        handlerList.add(new HandleA());
        handlerList.add(new HandleB());
    }
}
