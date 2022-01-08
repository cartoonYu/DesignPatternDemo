package org.DesignPatternDemo.StructuralDesignPattern.decorator;


import static java.util.Optional.ofNullable;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/08/22 16:50
 */
public class BufferDecoratorImpl implements Decorator {

    private Decorator decorator;

    private BufferOperate bufferOperate;

    @Override
    public String read(String fileName) {
        return ofNullable(bufferOperate.read(fileName))
                .orElse(decorator.read(fileName));
    }

    public BufferDecoratorImpl(Decorator decorator) {
        bufferOperate = new BufferOperate();
        this.decorator = decorator;
    }
}
