package org.DesignPatternDemo.CreateDesignPattern.factory;


import org.DesignPatternDemo.CreateDesignPattern.factory.sample.MultipartServiceImpl;
import org.DesignPatternDemo.CreateDesignPattern.factory.sample.PlusServiceImpl;
import org.DesignPatternDemo.CreateDesignPattern.factory.sample.SampleService;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/7/19 22:59
 */
public enum ServiceEnum {

    PLUS("plus", new PlusServiceImpl()),
    MULTIPART("multipart", new MultipartServiceImpl());

    private String method;

    private SampleService service;

    ServiceEnum(String method, SampleService service){
        this.method = method;
        this.service = service;
    }

    public String getMethod() {
        return method;
    }

    public SampleService getService() {
        return service;
    }
}
