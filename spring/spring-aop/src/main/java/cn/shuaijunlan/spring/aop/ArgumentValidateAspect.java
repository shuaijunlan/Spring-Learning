package cn.shuaijunlan.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 5:29 PM 5/28/19.
 */
@Aspect
@Component
@Order(1)
public class ArgumentValidateAspect {
    @Pointcut("execution(public boolean *.login(..))")
    public void pointcutName(){}


    @Before(value = "pointcutName()")
    public void loginBefore(JoinPoint joinPoint){
        Object[] obj = joinPoint.getArgs();
        for (Object argItem : obj) {
            System.out.println("---->now-->argItem:" + argItem);
        }
        System.out.println("LoginService.login() : " + joinPoint.getSignature().getName());
    }
}
