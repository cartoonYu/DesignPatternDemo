package demo.builder;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/8/4 09:32
 */
public class BuilderPojo {

    private int age;

    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    private BuilderPojo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static BuilderPojo build(int age, String name){
        if(age < 0 ||age > 150){
            throw new IllegalArgumentException("age must legal");
        }
        if(name == null){
            throw new IllegalArgumentException("name must legal");
        }
        return new BuilderPojo(age, name);
    }
}
