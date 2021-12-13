package org.design.pattern.demo.StructuralDesignPattern.composite;

import java.util.Arrays;
import java.util.List;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/07 09:10
 */
public class OperateServiceImpl implements OperateService{

    private List<OperatedObjectService> operatedObjectServices;

    @Override
    public void operate(String msg) {
        operatedObjectServices.forEach(operatedObject -> operatedObject.operate(msg));
    }

    public OperateServiceImpl() {
        operatedObjectServices = Arrays.asList(new SuperClass(), new SubClass());
    }
}
