package com.webspring.lab3.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* com.webspring.lab3.*.*(..))")
    public void beforeMethodExecution(JoinPoint joinPoint) {
        logger.info("Перед виконанням: " + joinPoint.getSignature().toShortString());
    }

    @After("execution(* com.webspring.lab3.*.*(..))")
    public void afterMethodExecution(JoinPoint joinPoint) {
        logger.info("Після виконання: " + joinPoint.getSignature().toShortString());
    }}
