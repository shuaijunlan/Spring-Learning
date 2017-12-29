package cn.shuaijunlan.learning.springboot.utils;

import cn.shuaijunlan.learning.springboot.domain.ResponseResult;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:37 2017/12/29.
 */
public class ResponseResultUtil {
    public static ResponseResult success(Object object){
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(0);
        responseResult.setMsg("Successfully");
        responseResult.setData(object);
        return responseResult;
    }

    public static ResponseResult success(){
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(0);
        responseResult.setMsg("Successfully");
        return responseResult;
    }

    public static ResponseResult fail(Integer code, String msg, Object object){
        ResponseResult responseResult = new ResponseResult();
        responseResult.setCode(code);
        responseResult.setMsg(msg);
        responseResult.setData(object);
        return responseResult;
    }
}
