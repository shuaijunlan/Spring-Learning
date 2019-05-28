package cn.shuaijunlan.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


/**
 * @author Shuai Junlan[shuaijunlan@gmail.com].
 * @since Created in 3:59 PM 5/28/19.
 */
@Aspect
@Component
public class LoginServiceAspect {
    @Before("execution(public boolean *.login(..))")
    public void loginBefore(JoinPoint joinPoint){
        System.out.println("LoginService.login() : " + joinPoint.getSignature().getName());
    }

    @Pointcut("execution(public boolean *.login(..))")
    public void pointcutName(){}

    public void within(){}

    @Around("pointcutName()")
    public Object performanceTrace(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        try {
            System.out.println("log.....");
            return proceedingJoinPoint.proceed();

        } finally {
            System.out.println("log end");
        }
    }

    @After("pointcutName()")
    public void after(){
        System.out.println("after");
    }

    @AfterReturning("pointcutName()")
    public void afterReturning(){
        System.out.println("after");
    }
}
