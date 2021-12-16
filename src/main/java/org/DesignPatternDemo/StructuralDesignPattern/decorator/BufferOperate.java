package org.DesignPatternDemo.StructuralDesignPattern.decorator;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/08/22 16:52
 */
public class BufferOperate {

    private Map<String, String> buffer;

    public String read(String key){
        return buffer.get(key);
    }

    public boolean write(String key, String value){
        return Objects.nonNull(buffer.put(key, value));
    }

    public BufferOperate() {
        buffer = new HashMap<>();
    }
}
