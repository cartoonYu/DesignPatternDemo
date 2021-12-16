package org.DesignPatternDemo.CreateDesignPattern.prototype;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/08/13 00:05
 */
public class ShallowCopyService implements CopyService{

    private static final String setterMethodFormat = "set%s";

    private static final String getterMethodFormat = "get%s";

    @Override
    public <T> T copy(T obj, Class<T> classType) {
        T res = null;
        try {
            Constructor<T> constructor = classType.getConstructor();
            res = constructor.newInstance();
            Field[] fields = classType.getDeclaredFields();
            for(Field field : fields){
                String fieldName  = field.getName();
                fieldName = (char) (fieldName.charAt(0) - 32) + fieldName.substring(1);
                String setterMethodName = String.format(setterMethodFormat, fieldName);
                String getterMethodName = String.format(getterMethodFormat, fieldName);
                Method setterMethod = classType.getDeclaredMethod(setterMethodName, field.getType());
                Method getterMethod = classType.getDeclaredMethod(getterMethodName);
                Object value = getterMethod.invoke(obj);
                setterMethod.invoke(res, value);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return res;
    }
}
