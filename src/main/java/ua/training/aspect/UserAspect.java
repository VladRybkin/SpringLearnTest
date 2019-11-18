package ua.training.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAspect {


    @Pointcut("execution(* get*(..))")
    public void beforeAllget() {
    }

    @Pointcut("execution(* timesout*())")
    public void beforeprint() {
    }

//
//    @Before("beforeAllget()")
//    public void getAdvice() {
//
//        System.out.println("ggff");
//
//    }

    @After("beforeprint()")
    public void printAdvice(JoinPoint joinPoint) {

        System.out.println("advice method called count = " + " " + joinPoint.getClass());

    }

}
