package cn.shuaijunlan.learning.springboot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Junlan Shuai[shuaijunlan@gmail.com].
 * @date Created on 18:36 2017/12/28.
 */
@Aspect
@Component
public class RequestAspect {
    private static final Logger logger = LoggerFactory.getLogger(RequestAspect.class);

    @Pointcut("execution(* cn.shuaijunlan.learning.springboot.controller.PersonControllerExample.*(..))")
//    @Pointcut("execution(public * sample.aop.service.PersonService.insertTwoPersons())"
//    @Pointcut("execution(* sample..*Service.*(..))")
    public void log() {

    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpServletRequest httpServletRequest = servletRequestAttributes.getRequest();
        logger.info("url={}", httpServletRequest.getRequestURL());
        logger.info("uri={}", httpServletRequest.getRequestURI());
        logger.info("method={}", httpServletRequest.getMethod());
        logger.info("ip={}", httpServletRequest.getRemoteAddr());
        logger.info("class_method={}.{}", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
        logger.info("args={}", joinPoint.getArgs());
    }

    @After("log()")
    public void doAfter() {
        logger.info("hello doAfter");
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturning(Object object) {
        if (object == null) {
            logger.info("response={}", "returning object is null pointer!");
        } else {
            logger.info("response={}", object.toString());
        }
    }
}
