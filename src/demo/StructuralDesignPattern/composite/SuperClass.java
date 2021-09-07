package demo.StructuralDesignPattern.composite;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/07 09:08
 */
public class SuperClass implements OperatedObjectService{

    @Override
    public void operate(String msg) {
        System.out.println("super class return: " + msg);
    }
}
