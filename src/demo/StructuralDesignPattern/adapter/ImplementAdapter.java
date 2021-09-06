package demo.StructuralDesignPattern.adapter;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/06 08:19
 */
public class ImplementAdapter implements DemoService{

    private final DemoService demoService;

    @Override
    public String adapterMethod(String msg) {
        System.out.println("adapter by implement");
        return demoService.adapterMethod(msg);
    }

    @Override
    public String process(String msg) {
        return demoService.process(msg);
    }

    public ImplementAdapter(DemoService demoService){
        this.demoService = demoService;
    }
}
