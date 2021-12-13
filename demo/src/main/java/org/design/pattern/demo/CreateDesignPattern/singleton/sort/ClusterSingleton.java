package org.design.pattern.demo.CreateDesignPattern.singleton.sort;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/7/18 21:54
 */
public class ClusterSingleton {

    private static final ConcurrentHashMap<String, ClusterSingleton> instances = new ConcurrentHashMap<>();

    public static ClusterSingleton getInstance(String clusterId){
        if(instances.get(clusterId) == null){
            synchronized (ClusterSingleton.class){
                if(instances.get(clusterId) == null){
                    instances.put(clusterId, new ClusterSingleton());
                }
            }
        }
        return instances.get(clusterId);
    }
}
