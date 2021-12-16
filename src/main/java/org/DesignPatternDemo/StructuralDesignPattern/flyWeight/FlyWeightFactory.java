package org.DesignPatternDemo.StructuralDesignPattern.flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/22 00:09
 */
public class FlyWeightFactory {

    private static Map<Integer, FlyWeightUnit> flyWeightUnitMap;

    public static FlyWeightUnit getFlyWeight(Integer returnCode){
        return flyWeightUnitMap.get(returnCode);
    }

    static {
        flyWeightUnitMap = new HashMap<>();
        flyWeightUnitMap.put(200, new FlyWeightUnit(200, "OK"));
        flyWeightUnitMap.put(403, new FlyWeightUnit(403, "unauthorized"));
        flyWeightUnitMap.put(404, new FlyWeightUnit(404, "not found"));
        flyWeightUnitMap.put(500, new FlyWeightUnit(500, "server error"));
    }
}
