package com.fundoonotes.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.fundoonotes.service..*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println("Started method: " + joinPoint.getSignature().getName());
    }

    @After("execution(* com.fundoonotes.service..*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("Completed method: " + joinPoint.getSignature().getName());
    }
}
