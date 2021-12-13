package org.design.pattern.demo.CreateDesignPattern.prototype;

/**
 * prototype demo pojo
 * @author cartoon
 * @version 1.0
 * @since 2021/08/12 23:58
 */
public class Person {

    private Integer mainKey;

    private Integer age;

    private String name;

    public Integer getAge() {
        return age;
    }

    public Person setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getMainKey() {
        return mainKey;
    }

    public Person setMainKey(Integer mainKey) {
        this.mainKey = mainKey;
        return this;
    }

    public Person(Integer mainKey, Integer age, String name) {
        this.mainKey = mainKey;
        this.age = age;
        this.name = name;
    }

    public Person() {
    }
}
