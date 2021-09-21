package demo.StructuralDesignPattern.flyWeight;

/**
 * @author cartoon
 * @version 1.0
 * @since 2021/09/22 00:08
 */
public class FlyWeightUnit {

    private Integer returnCode;

    private String returnMsg;


    public Integer getReturnCode() {
        return returnCode;
    }

    public FlyWeightUnit setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
        return this;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public FlyWeightUnit setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
        return this;
    }

    public FlyWeightUnit(Integer returnCode, String returnMsg) {
        this.returnCode = returnCode;
        this.returnMsg = returnMsg;
    }
}
