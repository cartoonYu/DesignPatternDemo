package org.design.pattern.demo.StructuralDesignPattern.facade;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/07 08:57
 */
public class FacadeServiceImpl implements FacadeService{

    private SubSystem1Service subSystem1;

    private SubSystem2Service subSystem2;

    @Override
    public String operate(String msg1, String msg2) {
        subSystem1.operate(msg1);
        subSystem2.operate(msg2);
        return "facade return: " + msg1 + msg2;
    }

    public FacadeServiceImpl() {
        subSystem1 = new SubSystem1ServiceImpl();
        subSystem2 = new SubSystem2ServiceImpl();
    }
}
