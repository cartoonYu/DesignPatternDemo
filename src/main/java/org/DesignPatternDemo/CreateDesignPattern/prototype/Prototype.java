package org.DesignPatternDemo.CreateDesignPattern.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/08/12 23:59
 */
public class Prototype {

    private static String refreshMsgFormat = "update data, update id: %d, source age: %d, update age: %d";

    private Map<Integer, Person> data;

    private Integer dataSize;

    private Integer updatePerTime;

    private long lastUpdateTime;

    public void refresh(){
        Random random = new Random();
        Map<Integer, Person> cloneMap = cloneMap(data);
        for(int index = 0; index < updatePerTime; index++){
            Integer updateId = random.nextInt(dataSize);
            if(data.containsKey(updateId)){
                Integer updateAge = random.nextInt(100);
                Person person = cloneMap.get(updateId);
                System.out.printf((refreshMsgFormat) + "%n", person.getMainKey(), person.getAge(), updateAge);
                person.setAge(updateAge);
                cloneMap.put(updateId, person);
            } else {
                System.out.println("prototype, can not get update data, update id: " + updateId);
            }
        }
        data = cloneMap;
        lastUpdateTime = System.currentTimeMillis();
        System.out.println("prototype, refresh success, update time: " + lastUpdateTime);
    }

    private Map<Integer, Person> cloneMap(Map<Integer, Person> sourceMap){
        CopyService copyService = new ShallowCopyService();
        Map<Integer, Person> res = new HashMap<>();
        sourceMap.forEach((id, person) -> {
            Person copyPerson = copyService.copy(person, Person.class);
            res.put(id, copyPerson);
        });
        return res;
    }

    public Prototype(){
        lastUpdateTime = -1;
        dataSize = 100;
        updatePerTime = 10;
        data = new HashMap<>();
        //mock data
        for(int index = 0; index < dataSize; index++){
            data.put(index, new Person(index, index, index + "mockData"));
        }
    }
}
