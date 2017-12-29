package cn.shuaijunlan.learning.springboot.handle;

import cn.shuaijunlan.learning.springboot.domain.ResponseResult;
import cn.shuaijunlan.learning.springboot.exception.PersonException;
import cn.shuaijunlan.learning.springboot.utils.ResponseResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 9:55 2017/12/29.
 */
@ControllerAdvice
public class ExceptionHandle {

    private static final Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseResult handle(Exception e){
        if (e instanceof PersonException){
            PersonException personException = (PersonException) e;
            return ResponseResultUtil.fail(personException.getCode(), personException.getMessage(), null);
        }
        logger.error("System Exception:{}", e);
        return ResponseResultUtil.fail(-1, e.getMessage(), null);
    }
}
