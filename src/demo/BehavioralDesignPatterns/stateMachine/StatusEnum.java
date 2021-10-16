package demo.BehavioralDesignPatterns.stateMachine;

/**
 * @author cartoon
 * @date 2021/10/16 23:14
 */
public enum StatusEnum {

    Status1(1, "status1"),
    Status2(2, "status2"),
    Status3(3, "status3"),
    Status4(4, "status4");

    private Integer status;

    private String msg;

    StatusEnum(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }
}
