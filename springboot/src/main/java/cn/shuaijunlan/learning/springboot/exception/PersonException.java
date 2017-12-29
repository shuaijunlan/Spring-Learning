package cn.shuaijunlan.learning.springboot.exception;

import cn.shuaijunlan.learning.springboot.enums.ResponseResultEnum;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 10:22 2017/12/29.
 */
public class PersonException extends RuntimeException {
    private Integer code;

    public PersonException (Integer code, String msg){
        super(msg);
        this.code = code;
    }

    public PersonException(ResponseResultEnum responseResultEnum){
        super(responseResultEnum.getMsg());
        this.code = responseResultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
