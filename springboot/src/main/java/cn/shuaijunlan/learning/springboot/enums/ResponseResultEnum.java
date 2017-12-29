package cn.shuaijunlan.learning.springboot.enums;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:46 2017/12/29.
 */
public enum ResponseResultEnum {
    UNKNOWN_ERROR(-1, "Unknown exception"),
    SUCCESS(100, "Successfully"),
    FORBIDDEN(403, "Forbidden")
    ;
    private Integer code;
    private String msg;

    ResponseResultEnum(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
