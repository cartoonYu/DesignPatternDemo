package demo.CreateDesignPattern.factory;

import demo.CreateDesignPattern.factory.sample.SampleService;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/7/19 22:59
 */
public class AbstractFactoryImpl extends AbstractFactory{

    @Override
    public SampleService get(String method) {
        Optional<ServiceEnum> resService = Arrays.stream(ServiceEnum.values()).filter(serviceEnum -> serviceEnum.getMethod().equals(method)).findFirst();
        return resService.map(ServiceEnum::getService).orElse(null);
    }
}
